package com.mk.company.web.domain.frontend;

import java.io.Serializable;

/**
 * create by TungNguyen on May, 2019
 */
public class FeedBack implements Serializable {

    private String email;
    private String firstName;
    private String lastName;
    private String feedBack;

    public FeedBack() {
    }

    public FeedBack(String firstName, String lastName, String feedBack, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.feedBack = feedBack;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FeedBack{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", feedBack='" + feedBack + '\'' +
                '}';
    }
}
