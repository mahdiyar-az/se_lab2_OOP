package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;
import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        // متد پیاده‌سازی نمی‌شود
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        // متد پیاده‌سازی نمی‌شود
    }


    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if (validateTelegramIdOrPhoneNumber(telegramMessage.getSourceTelegramIdOrPhone()) &&
                validateTelegramIdOrPhoneNumber(telegramMessage.getTargetTelegramIdOrPhone())) {

            System.out.println("Sending a Telegram message from " +
                    telegramMessage.getSourceTelegramIdOrPhone() +
                    " to " + telegramMessage.getTargetTelegramIdOrPhone() +
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

