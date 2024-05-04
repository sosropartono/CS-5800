import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, User> users = new HashMap<>();
    private Map<String, List<String>> blockedUsers = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.username, user);
    }

    public void unregisterUser(User user) {
        users.remove(user.username);
    }

    public void sendMessage(Message message) {
        for (String recipient : message.getRecipients()) {
            if (!isUserBlocked(recipient, message.getSender())) {
                User user = users.get(recipient);
                if (user != null) {
                    user.receiveMessage(message);
                }
            }
        }
    }

    public void blockUser(String blocker, String blockee) {
        if (!blockedUsers.containsKey(blocker)) {
            blockedUsers.put(blocker, new ArrayList<>());
        }
        blockedUsers.get(blocker).add(blockee);
    }

    private boolean isUserBlocked(String recipient, String sender) {
        List<String> blockedList = blockedUsers.get(recipient);
        return blockedList != null && blockedList.contains(sender);
    }
}
