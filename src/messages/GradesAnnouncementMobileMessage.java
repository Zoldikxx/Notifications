package messages;

public class GradesAnnouncementMobileMessage implements Grades{

	public String prepareMessage(String data) {
		if(verifyGrades(data))
			return "SMS: You've succedded and your grade is " + data;
		else
			return "SMS: You failed and your grade is " + data;
	}
	
	public boolean verifyGrades(String data) {
		boolean passed;
		if (Integer.parseInt(data) > 50)
			passed = true;
		else
			passed = false;
		return passed;
	}
}
