package com.example.wathchshopapi.global.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {
    private String code;
    private String message;
    private String stackTrace;
}
