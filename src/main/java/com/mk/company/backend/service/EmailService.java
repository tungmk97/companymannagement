package com.mk.company.backend.service;

import com.mk.company.web.domain.frontend.FeedBack;
import org.springframework.mail.SimpleMailMessage;

/**
 * create by TungNguyen on May, 2019
 */
public interface EmailService {

    public void sendFeedbackEmail(FeedBack feedBack);

    public void sendGenericEmail(SimpleMailMessage message);
}
