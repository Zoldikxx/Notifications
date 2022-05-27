package Messages;

public class EmailMessage extends Messages{
	
	@Override
	public String createDailyNews(String data) {
		DailyNewsEmailMessage dailyNewsEmailMessage = new DailyNewsEmailMessage();
		return dailyNewsEmailMessage.prepareMessage(data);
	}
	
	@Override
	public String createGrades(String data) {
		GradesAnnouncementEmailMessage announcementEmailMessage = new GradesAnnouncementEmailMessage();
		return announcementEmailMessage.prepareMessage(data);
	}

	@Override
	public String createTasks(String data) {
		TaskAddedEmailMessage addedEmailMessage = new TaskAddedEmailMessage();
		return addedEmailMessage.prepareMessage(data);	
	}

}
