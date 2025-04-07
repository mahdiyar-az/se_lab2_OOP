package edu.sharif.selab.services;

import edu.sharif.selab.models.*;

public class MessageServiceDispatcher {
    private final MessageService smsService;
    private final MessageService emailService;
    private final MessageService telegramService;

    public MessageServiceDispatcher() {
        this.smsService = new SmsMessageService();
        this.emailService = new EmailMessageService();
        this.telegramService = new TelegramMessageService();
    }

    public void send(Message message) {
        if (message instanceof SmsMessage) {
            smsService.sendMessage(message);
        } else if (message instanceof EmailMessage) {
            emailService.sendMessage(message);
        } else if (message instanceof TelegramMessage) {
            telegramService.sendMessage(message);
        }
    }
}