package task5.src;
import java.util.*;

public class main {
    public static void main(String... args){
        ChatRoom chatRoom = new ChatRoom(); // creating object of this class
        User user = new User("Islam", chatRoom);
        User user1 = new User("Rustam", chatRoom);
        User user2 = new User("Pervin", chatRoom);
        User user3  = new User("Sehrigul", chatRoom);

        user.start(); // starting thread
        user1.start();
        user2.start();
        user3.start();


        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chatRoom.printAllMessages();
    }
}

