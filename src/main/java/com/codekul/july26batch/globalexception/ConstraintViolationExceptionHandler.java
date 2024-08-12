package com.codekul.july26batch.globalexception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ControllerAdvice
public class ConstraintViolationExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> set = ex.getConstraintViolations();
        Set<String> set1 = new HashSet<>();

        set.forEach(s->{
            set1.add(s.getMessage());
            System.out.println("===============>"+set);
        });
        return new ResponseEntity<>(set1, BAD_REQUEST);
//        System.out.println(set);
    }

}
