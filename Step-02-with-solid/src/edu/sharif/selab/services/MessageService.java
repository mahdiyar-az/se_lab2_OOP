package edu.sharif.selab.services;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;

public interface MessageService {
    void sendMessage(Message message);
}
