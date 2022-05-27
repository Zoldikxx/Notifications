package Gateways;

import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAddedMobileMessage;
import Users.User;

public class SMSGateway implements Gateway{
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {user,message.toString()}; // set some place holders here 
		Messages m = new MobileMessage();
		
		if(message instanceof DailyNewsMobileMessage) {
			String SMS = m.createDailyNews(message,placeHolders);
			System.out.println(SMS);
		}
		
		else if(message instanceof GradesAnnouncementMobileMessage) {			
			String SMS = m.createGrades(message,placeHolders);
			System.out.println(SMS);
		}
		
		else if(message instanceof TaskAddedMobileMessage) {
			String SMS = m.createTasks(message,placeHolders);
			System.out.println(SMS);
		}
		
	}
}
