package messages;

public interface Task extends MessageType{
	public String prepareMessage(String data);
	public String addTeamDescription();
}
