package com.samao.dymcWeb.validation;

/**
 * Created by hsamao on 10/22/15.
 */


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = com.samao.dymcWeb.validation.VaildEmailImpl.class)
public @interface ValidEmail {
    String message() default "{This does not appear to be a valid email address!}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min() default 5;

}
