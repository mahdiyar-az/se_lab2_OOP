package edu.sharif.selab.models;

public class SmsMessage extends Message{

    @Override
    public MessageType getType() {
        return MessageType.SMS;
    }
}
