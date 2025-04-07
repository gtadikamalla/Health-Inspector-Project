package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${app.contact.recipient}")
    private String recipientEmail;

    public void sendContactEmail(String name, String email, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(recipientEmail);
        mailMessage.setSubject("New Contact Form Submission from " + name);
        mailMessage.setText("Name: " + name + "\nEmail: " + email + "\nMessage: " + message);
        mailMessage.setFrom(email); // Note: Gmail may override this

        mailSender.send(mailMessage);
    }
}