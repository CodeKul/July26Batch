package com.codekul.july26batch.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Human {
    private static final Logger logger = LoggerFactory.getLogger(Human.class);

    @Autowired
    private JavaMailSender mailSender;

    @Pointcut("within(com.codekul.july26batch.registration.controller..*)")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("In before" + joinPoint.getSignature());
    }

    @After("execution(public int study*())")
    public void after() {
        System.out.println("In after");
    }

    @AfterReturning(value = "execution( public String saveReg(..))", returning = "email")
    public void afterReturning(String email) {
        sendMail(email);
        System.out.println("in after returning " + email);
    }

    @AfterThrowing(pointcut = "execution(public int study*())", throwing = "value")
    public void afterThrowing(JoinPoint joinPoint, Throwable value) {
        logger.error("Exception in method: {} with cause: {}", joinPoint.getSignature(), value.getMessage());
        logger.info("Exception in method: {} with cause: {}", joinPoint.getSignature(), value.getMessage());
        logger.debug("Exception in method: {} with cause: {}", joinPoint.getSignature(), value.getMessage());
        logger.trace("Exception in method: {} with cause: {}", joinPoint.getSignature(), value.getMessage());
        logger.warn("Exception in method: {} with cause: {}", joinPoint.getSignature(), value.getMessage());
    }

    @Around(value = "execution(public int study*())")
    public Object around(ProceedingJoinPoint joinPoint) {
        logger.info("before method: {}", joinPoint.getSignature());
        long start = System.currentTimeMillis();
        Object object;
        try {
            object = joinPoint.proceed();//method execute
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        logger.info("after method execute: {}",  end - start);
        return object;
    }

    private void sendMail(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("Hello");
        message.setText("Hello World");
        message.setFrom("codekul.vaibhav@example.com");

        mailSender.send(message);

    }

}
