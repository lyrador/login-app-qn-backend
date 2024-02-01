package com.javaapp.dxcloginapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class InvalidUserDetailsException extends RuntimeException {

    public InvalidUserDetailsException(String message) {
        super(message);
    }
}
