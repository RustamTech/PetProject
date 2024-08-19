package task5.src;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<String> messageList;

    public ChatRoom() {
        messageList = new ArrayList<>();
    }

    public synchronized void sendMessage(String user, String message) {
        String formattedMessage = String.format("[%s]: %s", user, message);
        messageList.add(formattedMessage);
        System.out.println(formattedMessage);

        // using method string.format
    }

    public void printAllMessages() {
        
        for (String message : messageList) {
            System.out.println(message);
        }
    }
}
