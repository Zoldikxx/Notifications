package messages;

public class GradesAnnouncementEmailMessage implements Grades {

	public String prepareMessage(String data) {
		if(verifyGrades(data))
			return "Email: You've succedded and your grade is " + data;
		else
			return "Email: You failed and your grade is " + data;
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
