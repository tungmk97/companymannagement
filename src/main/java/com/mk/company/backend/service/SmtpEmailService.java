package com.mk.company.backend.service;

import com.sun.xml.internal.ws.resources.SenderMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * create by TungNguyen on May, 2019
 */
public class SmtpEmailService extends AbtractEmailService {

    @Autowired
    private MailSender mailSender;

    @Override
    public void sendGenericEmail(SimpleMailMessage message) {
        mailSender.send(message);
    }
}
