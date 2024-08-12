package com.codekul.july26batch.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> implements Serializable {

    private String message;

    private T result;

    private HttpStatus statusCode;

}
