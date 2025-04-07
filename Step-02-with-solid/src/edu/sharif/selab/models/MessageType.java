package edu.sharif.selab.models;

public enum MessageType {
    SMS, EMAIL, TELEGRAM;

    public static MessageType from(int choice) {
        if (choice == 1) {
            return SMS;
        } else if (choice == 2) {
            return EMAIL;
        } else if (choice == 3) {
            return TELEGRAM;
        } else {
            throw new IllegalArgumentException("Invalid message type.");
        }
    }
}