package Messages;

public class GradesAnnouncementMobileMessage {

	public String prepareMessage(String placeHolders[]) {
		// code to replace place holders of this type
		if(verifyGrades(Integer.parseInt(placeHolders[1]))) {}
		return "";
	}
	
	public boolean verifyGrades(int grade) {
		// code to verify Grades before announcement
		
		return true;
	}
}
