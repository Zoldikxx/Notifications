package notification;

import java.util.ArrayList;

import gateways.*;
import messages.Announcment;
import messages.EmailMessage;
import messages.Grades;
import messages.Messages;
import messages.MobileMessage;
import users.Professor;
import users.Student;
import users.TA;

public class Notification {
	ArrayList<Professor> professors;
	ArrayList<TA> tas;
	ArrayList<Student> students;
	
	public void subscribeStudent(Student student) {
		students.add(student);
	}
	
	public void subscribeProf(Professor prof) {
		professors.add(prof);
	}
	
	public void subscribeTA(TA ta) {
		tas.add(ta);
	}
	public void notifyAllUsers(Object messageGateway,Object messageType, String data) {
		Messages m;
		Gateway gateway;
		if(messageGateway instanceof EmailMessage) {
			m = new EmailMessage();
			gateway = new EmailGateway();
			String result;
			if(messageType instanceof Announcment) {
				result = m.createDailyNews(data);
			}
			else if(messageType instanceof Grades) {
				result = m.createGrades(data);
			}
			else {
				result = m.createTasks(data);
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(messageType,result);
			}
			
			for (TA ta : tas) {
				ta.notifyTA(result);
				gateway.sendMessage(messageType,result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(messageType,result);
			}
		}
		else {
			m = new MobileMessage();
			gateway = new SMSGateway();
			String result;
			if(messageType instanceof Announcment) {
				result = m.createDailyNews(data);
			}
			else if(messageType instanceof Grades) {
				result = m.createGrades(data);
			}
			else {
				result = m.createTasks(data);
			}
			for (Professor professor : professors) {
				professor.notifyProfessor(result);
				gateway.sendMessage(messageType,result);
			}
			
			for (TA ta : tas) {
				ta.notifyTA(result);
				gateway.sendMessage(messageType,result);
			}
			
			for (Student student : students) {
				student.notifyStudent(result);
				gateway.sendMessage(messageType,result);
			}
		}
	}
}
