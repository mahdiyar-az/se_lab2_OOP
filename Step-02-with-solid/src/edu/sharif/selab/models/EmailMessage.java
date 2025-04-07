package edu.sharif.selab.models;

public class EmailMessage extends Message{

    @Override
    public MessageType getType() {
        return MessageType.EMAIL;
    }
}
