package gateways;
import messages.Announcment;
import messages.EmailMessage;
import messages.Grades;
import messages.Messages;
import messages.Task;

public class EmailGateway implements Gateway{
	
	public void sendMessage(Object type,String data) {
		Messages m = new EmailMessage();
		String email;
		
		if(type instanceof Announcment) {
			email = m.createDailyNews(data);
			System.out.println(email);
		}
		
		else if(type instanceof Grades) {
			email = m.createGrades(data);
			System.out.println(email);
		}
		
		else if(type instanceof Task) {
			email = m.createTasks(data);
			System.out.println(email);
		}
		
	}
}
