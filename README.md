# Spring Boot Email Service

## Introduction

This project demonstrates a simple email service using Spring Boot. It provides functionality to send both simple emails and emails with attachments using Spring's `JavaMailSender`.

## Project Structure

The project is structured as follows:

### `com.org.entities.EmailDetails`

Entity class representing email details such as recipient, message body, subject, and attachment.

### `com.org.services.EmailService`

Interface defining methods for sending emails (`sendSimpleMail` and `sendMailWithAttachment`).

### `com.org.services.EmailServiceImpl`

Implementation of `EmailService` interface. This class utilizes `JavaMailSender` to send emails.

### `com.org.controller.EmailController`

REST controller exposing endpoints to send emails (`/sendMail` and `/sendMailWithAttachment`).

## Setup

### Requirements

- Java 8 or higher
- Maven
- Spring Boot

### Configuration

1. **Spring Mail Configuration**: Ensure that `spring.mail.username` property is configured in `application.properties` file with the email address you want to send emails from.

   ```properties
   
spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=Enter your email Id

spring.mail.password= Enter your password

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true
