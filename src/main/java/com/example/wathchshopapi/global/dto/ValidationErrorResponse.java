package com.example.wathchshopapi.global.dto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class ValidationErrorResponse extends ErrorResponseData {
    List<FieldValidateError> fieldErrors;

    public ValidationErrorResponse() {
        super("VALIDATION_FAILED", "tham số không chính xác");
        this.fieldErrors = new ArrayList<>();
    }

    public ValidationErrorResponse(List<FieldValidateError> fieldErrors) {
        super("VALIDATION_FAILED", "tham số không chính xác");
        this.fieldErrors = fieldErrors;
    }

    public void setFieldErrors(List<FieldValidateError> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public void addFieldError(FieldValidateError fieldError) {
        this.fieldErrors.add(fieldError);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ValidationErrorResponse that = (ValidationErrorResponse) o;
        return Objects.equals(fieldErrors, that.fieldErrors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fieldErrors);
    }

}
