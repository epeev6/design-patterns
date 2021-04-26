package mediatorAndSingleton;

public interface MessageMediator {
	
	void addUser(User user);
	
	void removeUser(User user);
	
	void sendMessage(String message, User user);
	
}
