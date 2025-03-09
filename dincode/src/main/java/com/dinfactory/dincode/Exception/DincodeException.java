package com.dinfactory.dincode.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
@Setter
public class DincodeException {
    private HttpStatus errorCode;
    private String errorMessage;
}
