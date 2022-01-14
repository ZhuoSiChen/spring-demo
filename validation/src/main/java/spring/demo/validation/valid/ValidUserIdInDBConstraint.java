package spring.demo.validation.valid;

import org.springframework.beans.factory.annotation.Autowired;
import spring.demo.validation.entity.Order;
import spring.demo.validation.repo.UserRepo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidUserIdInDBConstraint implements ConstraintValidator<ValidUserIdInDB, Order> {

    @Autowired
    UserRepo userRepo;

    @Override
    public void initialize(ValidUserIdInDB constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Order order, ConstraintValidatorContext constraintValidatorContext) {
        boolean present = userRepo.findById(order.getUserId()).isPresent();
        System.out.println(present);
        return present;
    }
}
