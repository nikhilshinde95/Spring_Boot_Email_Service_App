package com.org.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.org.entities.EmailDetails;
import com.org.services.EmailService;

@RestController
public class EmailController {
	
    @Autowired
    private EmailService emailService;

    @GetMapping("/hello")
    public String show(){
        return "Welcome to Spring Boot App";
    }


    @PostMapping("/sendMail")
    public ResponseEntity<Object> sendMail(@RequestBody EmailDetails emailDetails){
        String status  = emailService.sendSimpleMail(emailDetails);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }

    @PostMapping("/sendMailWithAttachment")
    public ResponseEntity<Object> sendMailWithAttachment(EmailDetails emailDetails){
        String status =  emailService.sendMailWithAttachment(emailDetails);
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
}
