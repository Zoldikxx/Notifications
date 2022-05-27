package Messages;

public class GradesAnnouncementEmailMessage extends Grades {

	public String prepareMessage(String data) {
		// code to replace place holders of this type
		if(verifyGrades(data))
			return "Email: You've succedded and your grade is " + data;
		else
		return "Email: You failed and your grade is " + data;
	}
	
	public boolean verifyGrades(String data) {
		// code to verify Grades before announcement
		if (Integer.parseInt(data) > 50)
			return true;
			else
				return false;
	}
}
