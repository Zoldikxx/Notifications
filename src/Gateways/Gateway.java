package Gateways;

import Users.User;

public interface Gateway {
	public void sendMessage(Object message, String user);
}
