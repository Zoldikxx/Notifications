package users;

import java.sql.Date;

public class Professor{
	String name;
	String department;
	Date hirringDate;
	String phdTopic;
	String email;
	String phoneNumber;
	
	
	public Professor(String name, String department, Date hirringDate, String phdTopic, String email,
			String phoneNumber) {
		super();
		this.name = name;
		this.department = department;
		this.hirringDate = hirringDate;
		this.phdTopic = phdTopic;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Date getHirringDate() {
		return hirringDate;
	}
	
	public void setHirringDate(Date hirringDate) {
		this.hirringDate = hirringDate;
	}
	
	public String getPhDTopic() {
		return phdTopic;
	}
	
	public void setPhDTopic(String phDTopic) {
		phdTopic = phDTopic;
	}
	
	public void notifyProfessor(String message) {
		System.out.println(this.name + " You got a notification: " + message);
	}

}
