package Messages;

public class GradesAnnouncementEmailMessage extends Grades {

	public String prepareMessage(String data) {
		if(verifyGrades(data))
			return "Email: You've succedded and your grade is " + data;
		else
		return "Email: You failed and your grade is " + data;
	}
	
	public boolean verifyGrades(String data) {
		if (Integer.parseInt(data) > 50)
			return true;
			else
				return false;
	}
}
