package com.samao.dymcWeb.validation;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by hsamao on 10/22/15.
 */
public class VaildEmailImpl implements ConstraintValidator<ValidEmail, String> {

    private int min;

    public void initialize(ValidEmail validEmail) {
        min = validEmail.min();
    }

    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {

        if (email.length() < min) {
            return false;
        }

        if (!EmailValidator.getInstance(false).isValid(email)) {
            return false;
        }

        return true;
    }
}
