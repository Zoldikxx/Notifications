package Messages;

public class GradesAnnouncementMobileMessage extends Grades{

	public String prepareMessage(String data) {
		// code to replace place holders of this type
		if(verifyGrades(data))
			return "SMS: You've succedded and your grade is " + data;
		else
		return "SMS: You failed and your grade is " + data;
	}
	
	public boolean verifyGrades(String data) {
		// code to verify Grades before announcement
		if (Integer.parseInt(data) > 50)
		return true;
		else
			return false;
	}
}
