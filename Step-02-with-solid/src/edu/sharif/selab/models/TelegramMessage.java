package edu.sharif.selab.models;

public class TelegramMessage extends Message {

    @Override
    public MessageType getType() {
        return MessageType.TELEGRAM;
    }
}

