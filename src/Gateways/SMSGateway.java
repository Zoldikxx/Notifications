package Gateways;

import Messages.Messages;
import Messages.MobileMessage;

public class SMSGateway implements Gateway{
	
	public void sendMessage(String type, String data) {
		Messages m = new MobileMessage();
		if(type.equalsIgnoreCase("news")) {
			String SMS = m.createDailyNews(data);
			System.out.println(SMS);
		}
		
		else if(type.equalsIgnoreCase("grades")) {			
			String SMS = m.createGrades(data);
			System.out.println(SMS);
		}
		
		else if(type.equalsIgnoreCase("tasks")) {
			String SMS = m.createTasks(data);
			System.out.println(SMS);
		}
		
	}
}
