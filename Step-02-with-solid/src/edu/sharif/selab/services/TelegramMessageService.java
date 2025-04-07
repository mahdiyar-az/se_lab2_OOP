package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;
import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendMessage(Message message) {
        TelegramMessage telegramMessage = (TelegramMessage) message;
        if (validateTelegramIdOrPhoneNumber(telegramMessage.getSource()) &&
                validateTelegramIdOrPhoneNumber(telegramMessage.getTarget())) {

            System.out.println("Sending a Telegram message from " +
                    telegramMessage.getSource() +
                    " to " + telegramMessage.getTarget() +
                    " with content: " + telegramMessage.getContent());
        } else {
            throw new IllegalArgumentException("Telegram ID or phone number is not valid!");
        }
    }

    private boolean validateTelegramIdOrPhoneNumber(String input) {
        // بررسی اینکه مقدار ورودی یک شماره تلفن معتبر ۱۱ رقمی یا یک آیدی تلگرام با @ باشد
        String phoneRegex = "^[0-9]{11}$";
        String telegramIdRegex = "^@[a-zA-Z0-9_]{5,}$";

        return Pattern.matches(phoneRegex, input) || Pattern.matches(telegramIdRegex, input);
    }
}

