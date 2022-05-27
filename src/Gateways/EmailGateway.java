package Gateways;

import Messages.EmailMessage;
import Messages.Messages;

public class EmailGateway implements Gateway{
	
	public void sendMessage(String type,String data) {
		Messages m = new EmailMessage();
		
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
