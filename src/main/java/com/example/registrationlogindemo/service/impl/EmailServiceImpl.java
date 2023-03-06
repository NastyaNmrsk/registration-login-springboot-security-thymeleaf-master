package com.example.registrationlogindemo.service.impl;

import com.example.registrationlogindemo.service.EmailService;
import com.example.registrationlogindemo.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


public class EmailServiceImpl implements EmailService {
    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(String to, String subject, String text) {
        System.out.println("start sending");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(AppConstants.NEW_MAIL_ACC);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
        System.out.println("send");
    }
}
