package com.mk.company.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by TungNguyen on May, 2019
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login() {
        return "user/login";
    }
}
