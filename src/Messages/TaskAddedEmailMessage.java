package Messages;

public class TaskAddedEmailMessage extends Task{

	@Override
	public String prepareMessage(String data) {
		// TODO Auto-generated method stub
		return "Email: You've got a new task "+ data;
	}
	
	@Override
	public String addTeamDescription() {
		return "Email: Teams must be from the same group";
	}
}
