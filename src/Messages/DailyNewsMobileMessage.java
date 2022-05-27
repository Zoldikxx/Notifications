package Messages;

public class DailyNewsMobileMessage {
	
	public String prepareMessage(String data) {
		return "SMS: Your've a new announcment " + data;
	}
}
