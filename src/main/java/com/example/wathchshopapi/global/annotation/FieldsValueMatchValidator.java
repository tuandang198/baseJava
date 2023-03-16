package com.example.wathchshopapi.global.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldValueMatch, Object> {

    private String fieldMatch;

    @Override
    public void initialize(FieldValueMatch constraintAnnotation) {
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        validateField(value.toString(), fieldMatch);
        return value.equals(fieldMatch);
    }

    private void validateField(Object value, String fieldMatch) {

    }
}
