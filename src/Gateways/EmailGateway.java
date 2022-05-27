package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAddedEmailMessage;
import Users.User;

public class EmailGateway implements Gateway{
	
	public void sendMessage(String data) {
		Messages m = new EmailMessage();
		
		if(message instanceof DailyNewsEmailMessage) {
//			DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
//			
//			dailyNewsEmailMessage.prepareMessage(placeHolders);
			
			String SMS = m.createDailyNews(data);
			System.out.println(SMS);
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementEmailMessage) {
//			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
//			
//			announcementEmailMessage.prepareMessage(placeHolders);
			String SMS = m.createGrades(data);
			System.out.println(SMS);
			
			// some code to send message
		}
		
		else if(message instanceof TaskAddedEmailMessage) {
//			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
//			
//			addedEmailMessage.prepareMessage(placeHolders);
			String SMS = m.createTasks(data);
			System.out.println(SMS);
			
			// some code to send message by email to user
		}
		
	}
}
