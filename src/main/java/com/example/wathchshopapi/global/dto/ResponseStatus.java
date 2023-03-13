package com.example.wathchshopapi.global.dto;

import lombok.Getter;

@Getter
public enum ResponseStatus {

    SUCCESS(200, "Thành công"),
    CREATED(201, "Tạo mới thành công"),
    BAD_REQUEST(400, "Tham số truyền vào chưa chính xác"),
    INTERNAL_SERVER_ERROR(500, "Lỗi hệ thống"),
    NOT_FOUND(404, "Không tìm thấy"),
    FORBIDDEN(403, "Không có quyền");

    private final int value;
    private final String message;

    ResponseStatus(int value, String message) {
        this.value = value;
        this.message = message;
    }
}