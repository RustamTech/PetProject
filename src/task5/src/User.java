package task5.src;
import java.util.*;

public class User extends Thread {
     private String name;
     private ChatRoom chatRoom;
     private Scanner scanner;

     public User(String name, ChatRoom chatRoom){
         this.name = name;
         this.chatRoom = chatRoom;
         this.scanner = new Scanner(System.in);
     }

     @Override
    public void run(){
         while(true){
             System.out.println(name);
             String message = scanner.nextLine();
             if (message.toLowerCase().equals("exit")) break;
             chatRoom.sendMessage(name, message);
             }
         }
     }
