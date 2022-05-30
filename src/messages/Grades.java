package messages;

public interface Grades extends MessageType{
	
	public String prepareMessage(String data);
	public boolean verifyGrades(String data);
}
