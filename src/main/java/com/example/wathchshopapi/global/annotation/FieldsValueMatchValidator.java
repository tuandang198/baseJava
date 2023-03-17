package com.example.wathchshopapi.global.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

public class FieldsValueMatchValidator implements ConstraintValidator<FieldValueMatch, Object> {

    private Class<?> validateClass;

    @Override
    public void initialize(FieldValueMatch constraintAnnotation) {
        this.validateClass = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        return validateField(value.toString(), validateClass);
    }

    private boolean validateField(Object value, Class<?> fieldMatch) {
        for (Field field : fieldMatch.getFields()) {
            return field.getName().equals(value);
        }
        return true;
    }
}
