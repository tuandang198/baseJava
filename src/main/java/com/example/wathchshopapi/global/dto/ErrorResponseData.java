package com.example.wathchshopapi.global.dto;

import lombok.Data;

@Data
public class ErrorResponseData {
    private String code;
    private String message;
    private String stackTrace;

    public ErrorResponseData(String code) {
        this(code, "Lỗi không xác định", "");
    }

    public ErrorResponseData(String code, String message) {
        this(code, message, "");
    }

    public ErrorResponseData(String code, String message, String stackTrace) {
        this.code = code;
        this.message = message;
        this.stackTrace = stackTrace;
    }
}
