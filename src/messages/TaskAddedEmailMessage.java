package messages;

public class TaskAddedEmailMessage implements Task{

	public String prepareMessage(String data) {
		return "Email: You've got a new task "+ data;
	}
	
	public String addTeamDescription() {
		return "Email: Teams must be from the same group";
	}
}
