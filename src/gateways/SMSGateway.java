package gateways;

import messages.Announcment;
import messages.Grades;
import messages.Messages;
import messages.MobileMessage;
import messages.Task;

public class SMSGateway implements Gateway{
	
	public void sendMessage(Object type, String data) {
		Messages m = new MobileMessage();
		String sms;
		
		if(type instanceof Announcment) {
			sms = m.createDailyNews(data);
			System.out.println(sms);
		}
		
		else if(type instanceof Grades) {			
			sms = m.createGrades(data);
			System.out.println(sms);
		}
		
		else if(type instanceof Task) {
			sms = m.createTasks(data);
			System.out.println(sms);
		}
		
	}
}
