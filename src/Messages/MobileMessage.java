package Messages;

public class MobileMessage extends Messages {

	@Override
	public String createDailyNews(String data) {
		DailyNewsMobileMessage msg = new DailyNewsMobileMessage();
		return msg.prepareMessage(data);
	}

	@Override
	public String createGrades(String data) {
		GradesAnnouncementMobileMessage msg = new GradesAnnouncementMobileMessage();
		return msg.prepareMessage(data);

	}

	@Override
	public String createTasks(String data) {
		TaskAddedMobileMessage msg = new TaskAddedMobileMessage();
		return msg.prepareMessage(data);

	}

}
