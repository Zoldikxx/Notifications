package Notification;

import java.util.ArrayList;

import Gateways.*;
import Messages.EmailMessage;
import Messages.Messages;
import Messages.MobileMessage;
import Users.Professor;
import Users.Student;
import Users.TA;

public class Notification {
	ArrayList<Professor> professors;
	ArrayList<TA> TAs;
	ArrayList<Student> students;
	
	public void subscribeStudent(Student student) {
		students.add(student);
	}
	
	public void subscribeProf(Professor prof) {
		professors.add(prof);
	}
	
	public void subscribeTA(TA ta) {
		TAs.add(ta);
	}
	public void notifyAllUsers(Object messageType,String type, String data) {
		Messages m;
		Gateway gateway;
		if(messageType instanceof EmailMessage) {
			m = new EmailMessage();
			gateway = new EmailGateway();
			String result;
			String message;
			if(type.equalsIgnoreCase("news")) {
				result = m.createDailyNews(data);
				message = "news";
			}
			else if(type.equalsIgnoreCase("grades")) {
				result = m.createGrades(data);
				message = "grades";
				
			}
			else {
				result = m.createTasks(data);
				message = "tasks";
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(message,result);
			}
			
			for (TA ta : TAs) {
				ta.notifyTA(result);
				gateway.sendMessage(message,result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(message,result);
			}
		}
		else {
			m = new MobileMessage();
			gateway = new SMSGateway();
			String result;
			String message;
			if(type.equalsIgnoreCase("news")) {
				result = m.createDailyNews(data);
				message = "news";
			}
			else if(type.equalsIgnoreCase("grades")) {
				result = m.createGrades(data);
				message = "grades";
			}
			else {
				result = m.createTasks(data);
				message = "tasks";
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(message,result);
			}
			
			for (TA ta : TAs) {
				ta.notifyTA(result);
				gateway.sendMessage(message,result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(message,result);
			}
		}
	}
}
