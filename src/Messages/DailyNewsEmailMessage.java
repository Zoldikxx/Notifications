package Messages;

public class DailyNewsEmailMessage extends Announcment{

	@Override
	public String prepareMessage(String data) {
		return "Email: Your've a new announcment " + data;
	}

	}
