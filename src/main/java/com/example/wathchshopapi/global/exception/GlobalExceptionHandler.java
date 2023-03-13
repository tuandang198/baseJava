package com.example.wathchshopapi.global.exception;

import com.example.wathchshopapi.global.annotation.ResponseErrorCode;
import com.example.wathchshopapi.global.dto.ErrorResponseData;
import com.example.wathchshopapi.global.dto.ResponseStatus;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseData> handleUnwantedException(Exception e) {
        e.printStackTrace();
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponseData(
                        ResponseStatus.INTERNAL_SERVER_ERROR.toString()
                        , ResponseStatus.INTERNAL_SERVER_ERROR.getMessage()
                        , ExceptionUtils.getStackTrace(e)));
    }

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorResponseData> handleApplicationExceptions(ApplicationException ex) {
        var response = new ErrorResponseData(
                "UNKNOWN_ERROR", ex.getMessage(), ExceptionUtils.getStackTrace(ex));
        var status = HttpStatus.BAD_REQUEST;
        var cls = ex.getClass();
        if (cls != null) {
            var errorCode = AnnotationUtils.getAnnotation(cls, ResponseErrorCode.class);
            if (errorCode != null) {
                response.setCode(errorCode.value());
            }

            var statusCode = AnnotationUtils.getAnnotation(
                    cls,
                    org.springframework.web.bind.annotation.ResponseStatus.class);
            if (statusCode != null) {
                status = statusCode.value();
            }
        }
        return ResponseEntity.status(status).body(response);
    }
}
