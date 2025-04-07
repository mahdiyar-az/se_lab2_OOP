package edu.sharif.selab.utils;

import edu.sharif.selab.models.*;

public class MessageFactory {
    public static Message createMessage(MessageType type) {
        switch (type) {
            case SMS:
                return new SmsMessage();
            case EMAIL:
                return new EmailMessage();
            case TELEGRAM:
                new TelegramMessage();
            default:
                throw new IllegalArgumentException("Unknown message type");

        }
    }
}
