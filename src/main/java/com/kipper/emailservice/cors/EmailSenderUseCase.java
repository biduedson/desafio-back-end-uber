package com.kipper.emailservice.cors;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
