package com.mk.company.backend.service;

import org.springframework.mail.SimpleMailMessage;

/**
 * create by TungNguyen on May, 2019
 */
public class MockEmailService extends AbtractEmailService {

    @Override
    public void sendGenericEmail(SimpleMailMessage message) {
        System.out.println("Semulating email service...");
        System.out.println(message.toString());
        System.out.println("Sent Ok nha");
    }
}
