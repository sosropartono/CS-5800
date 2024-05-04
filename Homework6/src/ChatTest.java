import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ChatTest {

    @Test
    public void testMessageSending() {
        ChatServer server = new ChatServer();
        User chris = new User("Chris", server);
        User jake = new User("Jake", server);

        server.registerUser(chris);
        server.registerUser(jake);

        jake.sendMessage(new String[]{"Chris"}, "Hello Chris!");

        // Get chilla's chat history to verify the received message
        List<Message> chillaMessages = chris.getChatHistory().getMessages();
        assertEquals(1, chillaMessages.size());
        assertEquals("Hello Chris!", chillaMessages.get(0).getContent());
    }

    @Test
    public void testUndoLastMessage() {
        ChatServer server = new ChatServer();
        User jack = new User("jack", server);
        User chilla = new User("chilla", server);

        server.registerUser(jack);
        server.registerUser(chilla);

        jack.sendMessage(new String[]{"chilla"}, "Hello chilla!");

        // jack attempts to undo her last message
        jack.undoLastMessage();

        // Get chilla's chat history to verify that the last message is undone
        List<Message> chillaMessages = chilla.getChatHistory().getMessages();
        assertEquals(1, chillaMessages.size());
    }

    @Test
    public void testMessageReceiving() {
        ChatServer server = new ChatServer();
        User jack = new User("jack", server);
        User chilla = new User("chilla", server);

        server.registerUser(jack);
        server.registerUser(chilla);

        jack.sendMessage(new String[]{"chilla"}, "Hello chilla!");

        // Get chilla's chat history to verify the received message
        List<Message> chillaMessages = chilla.getChatHistory().getMessages();
        assertEquals(1, chillaMessages.size());
        assertEquals("Hello chilla!", chillaMessages.get(0).getContent());
    }

    @Test
    public void testBlockingUser() {
        ChatServer server = new ChatServer();
        User jack = new User("jack", server);
        User chilla = new User("chilla", server);

        server.registerUser(jack);
        server.registerUser(chilla);

        chilla.blockUser("jack");

        jack.sendMessage(new String[]{"chilla"}, "This message should be blocked.");

        // Get chilla's chat history to verify that the message was not received
        List<Message> chillaMessages = chilla.getChatHistory().getMessages();
        assertEquals(0, chillaMessages.size());
    }

    @Test
    public void testChatHistoryDisplay() {
        ChatServer server = new ChatServer();
        User jack = new User("jack", server);

        server.registerUser(jack);

        jack.sendMessage(new String[]{"jack"}, "Hi jack!");

        // Get jack's chat history to verify the sent message
        List<Message> jackMessages = jack.getChatHistory().getMessages();
        assertEquals(2, jackMessages.size());
        assertEquals("Hi jack!", jackMessages.get(0).getContent());
    }


    @Test
    public void testMessageIterationByUser() {
        ChatServer server = new ChatServer();
        User jack = new User("jack", server);

        server.registerUser(jack);

        jack.sendMessage(new String[]{"jack"}, "Hello jack!");
        jack.sendMessage(new String[]{"jack"}, "How are you?");

        // Get jack's chat history and verify the messages by iteration
        List<Message> jackMessages = jack.getChatHistory().getMessages();
        for (Message message : jackMessages) {
            assertNotNull(message);
        }
    }
}
