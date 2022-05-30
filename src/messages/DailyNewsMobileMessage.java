package messages;

public class DailyNewsMobileMessage implements Announcment{
	
	public String prepareMessage(String data) {
		return "SMS: Your've a new announcment " + data;
	}
}
