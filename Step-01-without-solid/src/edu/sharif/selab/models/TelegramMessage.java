package edu.sharif.selab.models;

public class TelegramMessage extends Message {
    private String sourceTelegramIdOrPhone;
    private String targetTelegramIdOrPhone;

    public String getSourceTelegramIdOrPhone() {
        return sourceTelegramIdOrPhone;
    }

    public void setSourceTelegramIdOrPhone(String sourceTelegramIdOrPhone) {
        this.sourceTelegramIdOrPhone = sourceTelegramIdOrPhone;
    }

    public String getTargetTelegramIdOrPhone() {
        return targetTelegramIdOrPhone;
    }

    public void setTargetTelegramIdOrPhone(String targetTelegramIdOrPhone) {
        this.targetTelegramIdOrPhone = targetTelegramIdOrPhone;
    }
}

