package messages;

public class EmailMessage implements Messages{
	
	public String createDailyNews(String data) {
		DailyNewsEmailMessage dailyNewsEmailMessage = new DailyNewsEmailMessage();
		return dailyNewsEmailMessage.prepareMessage(data);
	}
	
	public String createGrades(String data) {
		GradesAnnouncementEmailMessage announcementEmailMessage = new GradesAnnouncementEmailMessage();
		return announcementEmailMessage.prepareMessage(data);
	}

	public String createTasks(String data) {
		TaskAddedEmailMessage addedEmailMessage = new TaskAddedEmailMessage();
		return addedEmailMessage.prepareMessage(data);	
	}

}
