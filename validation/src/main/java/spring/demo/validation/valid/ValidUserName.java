package spring.demo.validation.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidUserIdInDBConstraint.class)
public @interface ValidUserName {

    String message() default "{validUserName.error.message}";

    Class<?>[] groups() default {};

    public abstract Class<? extends Payload>[] payload() default {};
}
