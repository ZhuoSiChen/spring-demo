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
public @interface ValidUserIdInDB {

    String message() default "数据库不存在此用户";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
