import java.util.ArrayList;

import Gateways.EmailGateway;
import Messages.TaskAddedEmailMessage;
import Notification.Notification;
import Users.Professor;
import Users.Student;
import Users.TA;
enum MessageGateway{
	
}
public class Course {
	
	String name;
	String code;
	Notification notification;
	Messages message;
	ArrayList<Professor> professors;
	ArrayList<TA> TAs;
	ArrayList<Student> students;
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	
	public void setMessageAsEmail() {
		message = new EmailMessage();
	}
	public void setMessageAsSMS() {
		message = new MobileMessage();
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public Notification getNotification() {
		return notification;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void addStudent(Student student) {
		notification.subscribeStudent(student);
	}
	
	public void addProfessor(Professor professor) {
		notification.subscribeProf(professor);
	}
	
	public void addTA(TA ta) {
		notification.subscribeTA(ta);
	}
	
	public void AddAssignment(String assignBody) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),new Task(),assignBody);
		else
			notification.notifyAllUsers(new MobileMessage(),new Task(),assignBody);
	}
	
	public void AddGrade(String grade) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),new Grades(),assignBody);
		else
			notification.notifyAllUsers(new MobileMessage(),new Grades(),assignBody);
	}
	
	public void addNews(String news ) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),new Grades(),assignBody);
		else
			notification.notifyAllUsers(new MobileMessage(),new Grades(),assignBody);
	}	
}
