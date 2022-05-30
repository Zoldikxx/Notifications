package messages;

public class TaskAddedMobileMessage implements Task{

	public String prepareMessage(String data) {
		return "SMS: You've got a new task "+ data ;
	}
	
	public String addTeamDescription() {
		return "SMS: Teams must be from the same group";
	}
}
