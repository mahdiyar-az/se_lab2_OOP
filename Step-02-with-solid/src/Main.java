import edu.sharif.selab.models.*;
import edu.sharif.selab.services.*;
import edu.sharif.selab.utils.MessageFactory;
import edu.sharif.selab.utils.UserInputHandler;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MessageServiceDispatcher dispatcher = new MessageServiceDispatcher();
        MessageType type = UserInputHandler.getMessageType();  // Input logic moved to utils
        Message message = MessageFactory.createMessage(type);
        UserInputHandler.fillMessageDetails(message);        // Sets source/target/content
        dispatcher.send(message);
    }
}