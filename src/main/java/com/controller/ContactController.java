package com.controller;

import com.mfrp.model.ContactForm;
import com.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/contact")
    public String showContactForm(Model model) {
        model.addAttribute("contactForm", new ContactForm());
        return "views/dologin"; // Return the homepage template
    }

    @PostMapping("/contact")
    public String submitContactForm(@ModelAttribute ContactForm contactForm, Model model) {
        try {
            emailService.sendContactEmail(contactForm.getName(), contactForm.getEmail(), contactForm.getMessage());
            model.addAttribute("successMessage", "Thank you for your message! We will get back to you soon.");
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Failed to send your message. Please try again later.");
            e.printStackTrace();
        }
        return "index1"; // Return the homepage template
    }
}