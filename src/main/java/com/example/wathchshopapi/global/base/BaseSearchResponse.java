package com.example.wathchshopapi.global.base;

import lombok.Data;

import java.util.List;

@Data
public class BaseSearchResponse {
    private List<?> items;
    private int totalPages;
    private int totalElements;
}
