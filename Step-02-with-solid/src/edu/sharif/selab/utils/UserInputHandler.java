package edu.sharif.selab.utils;

import edu.sharif.selab.models.*;
import java.util.Scanner;

public class UserInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    // Gets the message type from user input
    public static MessageType getMessageType() {
        System.out.println("Select message type:");
        System.out.println("1. SMS");
        System.out.println("2. Email");
        System.out.println("3. Telegram");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        return MessageType.from(choice);
    }

    // Collects message details (source, target, content)
    public static void fillMessageDetails(Message message) {
        MessageType type = message.getType();

        System.out.print("Enter source " + getFieldDescription(type) + ": ");
        message.setSource(scanner.nextLine());

        System.out.print("Enter target " + getFieldDescription(type) + ": ");
        message.setTarget(scanner.nextLine());

        System.out.println("Write your message:");
        message.setContent(scanner.nextLine());
    }

    // Helper: Returns field descriptions (e.g., "phone" for SMS)
    private static String getFieldDescription(MessageType type) {
        switch (type) {
            case SMS:
                return "phone number";
            case EMAIL:
                return "email address";
            case TELEGRAM:
                return "Telegram ID/phone";
            default:
                throw new IllegalArgumentException("Unknown message type");
        }
    }
}