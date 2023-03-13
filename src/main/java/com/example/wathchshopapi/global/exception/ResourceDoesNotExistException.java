package com.example.wathchshopapi.global.exception;

import com.example.wathchshopapi.global.annotation.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@ResponseErrorCode("RESOURCE_NOT_FOUND")
public class ResourceDoesNotExistException extends ApplicationException {
    public ResourceDoesNotExistException(String resource) {
        super(resource + " không tồn tại");
    }

    public ResourceDoesNotExistException() {
        super("tài nguyên không tồn tại");
    }
}
