package com.dinfactory.dincode.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public DincodeException HandleException(Exception exception){
        return new DincodeException(HttpStatus.BAD_REQUEST, exception.getMessage());
    }
}
