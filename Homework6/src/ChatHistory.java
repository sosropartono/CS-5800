import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if (!messages.isEmpty()) {
            return messages.get(messages.size() - 1);
        }
        return null;
    }

    public void

    removeLastMessage() {
        if (!messages.isEmpty()) {
            messages.remove(messages.size() - 1);
        }
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void displayHistory() {
        for (Message message : messages) {
            System.out.println(message.getTimestamp() + " " +
                    message.getSender() + ": " + message.getContent());
        }
    }
}
