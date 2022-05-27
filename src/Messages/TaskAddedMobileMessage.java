package Messages;

public class TaskAddedMobileMessage extends Task{

	@Override
	public String prepareMessage(String data) {
		return "SMS: You've got a new task "+ data ;
	}
	
	@Override
	public String addTeamDescription() {
		return "SMS: Teams must be from the same group";
	}
}
