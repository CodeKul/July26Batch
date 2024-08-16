package com.codekul.july26batch.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Human {

    @Autowired
    private JavaMailSender mailSender;

    @Pointcut("within(com.codekul.july26batch.registration.controller..*)")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("In before"+joinPoint.getSignature());
    }

    @After("execution(public void study())")
    public void after(){
        System.out.println("In after");
    }

    @AfterReturning(value = "execution( public String saveReg(..))",returning = "email")
    public void afterReturning(String email){
        sendMail(email);
        System.out.println("in after returning "+email);
    }

    private void sendMail(String email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Hello");
        message.setText("Hello World");
        message.setFrom("codekul.vaibhav@example.com");

        mailSender.send(message);

    }

}
