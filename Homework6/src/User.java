import java.util.Stack;

public class User {
    public String username;
    private ChatServer chatServer;
    private ChatHistory chatHistory;
    private Stack<MessageMemento> messageHistory;

    public User(String username, ChatServer chatServer) {
        this.username = username;
        this.chatServer = chatServer;
        this.chatHistory = new ChatHistory();
        this.messageHistory = new Stack<>();
    }

    public void sendMessage(String[] recipients, String content) {
        Message message = new Message(this.username, recipients, content);
        chatServer.sendMessage(message);
        chatHistory.addMessage(message);

        // Save a memento of the sent message for potential undo
        MessageMemento memento = new MessageMemento(message.getContent(), message.getTimestamp());
        messageHistory.push(memento);
    }

    public void receiveMessage(Message message) {
        System.out.println("Received message from " + message.getSender() + ": " + message.getContent());
        chatHistory.addMessage(message);
    }

    public void undoLastMessage() {
        if (!messageHistory.isEmpty()) {
            MessageMemento lastMemento = messageHistory.pop();
            System.out.println("Undoing last message: " + lastMemento.getContent());

            // Optionally: You can implement message removal logic here
            // based on the memento information if needed.
        } else {
            System.out.println("No messages to undo.");
        }
    }

    public void blockUser(String username) {
        chatServer.blockUser(this.username, username);
    }

    public void viewChatHistory() {
        System.out.println("Chat history for " + this.username + ":");
        chatHistory.displayHistory();
    }

    public ChatHistory getChatHistory() {
        return chatHistory;
    }
}
