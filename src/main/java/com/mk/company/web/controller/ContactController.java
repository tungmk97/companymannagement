package com.mk.company.web.controller;

import com.mk.company.backend.service.EmailService;
import com.mk.company.web.domain.frontend.FeedBack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by TungNguyen on May, 2019
 */

@Controller
public class ContactController {

    private static final Logger LOG = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/contact")
    public String getContact(Model model) {
        FeedBack feedBack = new FeedBack();
        model.addAttribute("feedback", feedBack);
        return "contact/contact";
    }

    @PostMapping(value = "/contact")
    public String postContact(@ModelAttribute("feedback") FeedBack feedback) {
        System.out.println(feedback);
//        emailService.sendFeedBackEmail(feedback);
        emailService.sendFeedbackEmail(feedback);
        return "contact/contact";
    }
}
