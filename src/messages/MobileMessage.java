package messages;

public class MobileMessage implements Messages {

	public String createDailyNews(String data) {
		DailyNewsMobileMessage msg = new DailyNewsMobileMessage();
		return msg.prepareMessage(data);
	}

	public String createGrades(String data) {
		GradesAnnouncementMobileMessage msg = new GradesAnnouncementMobileMessage();
		return msg.prepareMessage(data);

	}

	public String createTasks(String data) {
		TaskAddedMobileMessage msg = new TaskAddedMobileMessage();
		return msg.prepareMessage(data);

	}

}
