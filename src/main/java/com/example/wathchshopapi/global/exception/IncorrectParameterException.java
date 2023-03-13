package com.example.wathchshopapi.global.exception;

import com.example.wathchshopapi.global.annotation.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@ResponseErrorCode("INCORRECT_PARAMETER")
public class IncorrectParameterException extends ApplicationException {
    public IncorrectParameterException(String resource) {
        super(resource + " không chính xác");
    }

    public IncorrectParameterException() {
        super("tham số không chính xác");
    }
}
