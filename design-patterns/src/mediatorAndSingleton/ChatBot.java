package mediatorAndSingleton;

public class ChatBot {

	private static ChatBot instance;
	
	private ChatBot() {
		
	}


	public static ChatBot getInstance() {
		
		if(instance == null) {
			instance = new ChatBot();
		}
		
		return instance;
	}
	
	public void postMessage(String message, String bannedWord, User user, Chat chat) {
		
		if(message.contains(bannedWord)) {
			chat.removeUser(user);
			for(User chatUser: chat.getUsers()) {
				chatUser.receive(bannedWord + " is a banned word.");
				
			}
		} else {
			for(User chatUser: chat.getUsers()) {
				if(user != chatUser) {
					chatUser.receive(message);
				}
			}
		}
		
		
	}
}
