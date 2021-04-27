package mediatorAndSingleton;

public class MediatorMain {
	
	public static void main(String[] args) {
		
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Maria");
		User user3 = new ChatUser(chat, "Georgi");
		
		user2.send("Hi guys!");
		user3.send("Hello!");
		user3.send("addBot");
		user1.send("AAAAAAA");
		user1.send("cat"); // banned word
		user1.send("BBBBBBBBBBB"); // banned user tries to send another message.
		user3.send("CCCCCCCCCCC");
		
	}

}


//commit test
