package Messages;

public class DailyNewsMobileMessage {
	
	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		return "Dear " + placeHolders[0] + " This is your daily news: " + placeHolders[1];
	}
}
