package course;

import messages.EmailMessage;
import messages.Messages;
import messages.MobileMessage;
import notification.Notification;
import users.Professor;
import users.Student;
import users.TA;

public class Course {
	String name;
	String code;
	Notification notification;
	Messages message;
	
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
	
	public void addAssignment(String assignBody) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),"task",assignBody);
		else
			notification.notifyAllUsers(new MobileMessage(),"task",assignBody);
	}
	
	public void addGrade(String grade) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),"grades",grade);
		else
			notification.notifyAllUsers(new MobileMessage(),"grades",grade);
	}
	
	public void addNews(String news ) {
		if(message instanceof EmailMessage)
			notification.notifyAllUsers(new EmailMessage(),"news",news);
		else
			notification.notifyAllUsers(new MobileMessage(),"news",news);
	}	
}
