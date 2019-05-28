package com.mk.company.backend.service;

import com.mk.company.web.domain.frontend.FeedBack;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * create by TungNguyen on May, 2019
 */
public class AbtractEmailService implements EmailService{

    @Value("${default.to.address}")
    private String defaultToAddress;
    @Override
    public void sendFeedbackEmail(FeedBack feedBack) {
        sendGenericEmail(prepareSimpleMessageFromFeedback(feedBack));
    }

    @Override
    public void sendGenericEmail(SimpleMailMessage message) {

    }

    public SimpleMailMessage prepareSimpleMessageFromFeedback(FeedBack feedBack) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(defaultToAddress);
        simpleMailMessage.setFrom(feedBack.getEmail());
        simpleMailMessage.setSubject("New feedback " + feedBack.getFirstName() + feedBack.getLastName());
        simpleMailMessage.setText(feedBack.getFeedBack());

        return simpleMailMessage;
    }
}
