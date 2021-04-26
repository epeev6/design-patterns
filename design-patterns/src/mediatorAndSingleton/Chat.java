package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {
	
	private List<User> users;
	private ChatBot chatBot;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);
		
	}
	
	public List<User> getUsers() {
		return this.users;
	}
	
	
	@Override
	public void sendMessage(String message, User user) {
		
		if(message.equals("addBot")) {
			System.out.println(user.name + " added a bot.");
			chatBot = ChatBot.getInstance();
		}
		
		if(this.users.contains(user) == false) {
			System.out.println("User " + user.name + " not found.");
			return;
		}
		
		
		if(chatBot == null) {
			for(User chatUser: this.users) {
				if(user != chatUser) {
					chatUser.receive(message);
				}
			}
			
		} else {
			chatBot.postMessage(message, "cat", user, this);
		}
	}



}
