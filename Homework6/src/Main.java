public class Main {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        User michelle = new User("Michelle", server);
        User abraham = new User("Abraham", server);
        User jack = new User("Jack", server);
        server.registerUser(michelle);
        server.registerUser(abraham);
        server.registerUser(jack);
        // michelle sends a message to abraham and jack
        michelle.sendMessage(new String[]{"abraham", "jack"}, "Hello abraham and jack!");
        // abraham blocks messages from michelle
        abraham.blockUser("michelle");
        jack.sendMessage(new String[]{"michelle"}, "Hi michelle!");
        michelle.viewChatHistory();
        michelle.undoLastMessage();
        michelle.viewChatHistory();
    }
}
