package chatbot;

public class Chatbot {
	
	private String username;
	private boolean chatting;
	private Topic alice;

	public Chatbot() {
		alice = new AliceBot();
		username = "Unknown User";
		chatting = true;

	}

	public void startChatting() {
		
		//whenever you print or get input use these methods
		ChatbotMain.print("Hi! I am an intelligent machine that can respond to your input. Tell me your name.");
		username = ChatbotMain.getInput();
		
		while(chatting) {
			
			ChatbotMain.print("What would you like to talk about?");
			String response = ChatbotMain.getInput();
			if(alice.isTriggered(response)) {
				chatting = false; //exits the while loop. IMPORTANT YOU GET GRADED FOR THIS
				alice.talk(response);
			}
			else {
				ChatbotMain.print("Im sorry. I don't understand. I never said I was perfect.");
			}
		}
		
	}

}
