package Notification;

import java.util.ArrayList;

import Gateways.*;
import Users.Professor;
import Users.Student;
import Users.TA;
import Users.User;

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
	private void notifyAllUsers(Object messageType,Object messageData, String data) {
		Messages m;
		Gateway gateway;
		if(messageType instanceof EmailMessages) {
			m = new EmailMessage();
			gateway = new EmailGateway();
			String result;
			if(messageData instanceof Announcement) {
				result = m.createDailyNews(data);
			}
			else if(messageData instanceof Grades) {
				result = m.createGrades(data);
			}
			else {
				result = m.createTasks(data);
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(result);
			}
			
			for (TA ta : TAs) {
				ta.notifyTA(result);
				gateway.sendMessage(result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(result);
			}
		}
		else {
			m = new MobileMessage();
			gateway = new SMSGateway();
			String result;
			if(messageData instanceof Announcement) {
				result = m.createDailyNews(data);
			}
			else if(messageData instanceof Grades) {
				result = m.createGrades(data);
			}
			else {
				result = m.createTasks(data);
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(result);
			}
			
			for (TA ta : TAs) {
				ta.notifyTA(result);
				gateway.sendMessage(result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(result);
			}
		}
	}
}
