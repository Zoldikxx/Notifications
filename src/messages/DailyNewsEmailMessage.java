package messages;

public class DailyNewsEmailMessage implements Announcment{

	public String prepareMessage(String data) {
		return "Email: Your've a new announcment " + data;
	}

}