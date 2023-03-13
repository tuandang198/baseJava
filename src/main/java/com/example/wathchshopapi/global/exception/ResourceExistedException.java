package com.example.wathchshopapi.global.exception;

import com.example.wathchshopapi.global.annotation.ResponseErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
@ResponseErrorCode(value = "RESOURCE_EXISTED")
public class ResourceExistedException extends ApplicationException{
    public ResourceExistedException(String resource) {
        super(resource + " đã tồn tại");
    }
    public ResourceExistedException() {
        super("tài nguyên đã tồn tại");
    }
}
