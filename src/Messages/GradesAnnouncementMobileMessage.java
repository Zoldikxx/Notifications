package Messages;

public class GradesAnnouncementMobileMessage extends Grades{

	public String prepareMessage(String data) {
		if(verifyGrades(data))
			return "SMS: You've succedded and your grade is " + data;
		else
		return "SMS: You failed and your grade is " + data;
	}
	
	public boolean verifyGrades(String data) {
		if (Integer.parseInt(data) > 50)
		return true;
		else
			return false;
	}
}
