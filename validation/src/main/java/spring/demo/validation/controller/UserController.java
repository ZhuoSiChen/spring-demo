package spring.demo.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.demo.validation.entity.User;
import spring.demo.validation.entity.UserAdd;
import spring.demo.validation.entity.UserEdit;
import spring.demo.validation.repo.UserRepo;


@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/users")
    public Page<User> list(Pageable page){
        return userRepo.findAll(page);
    }

    @PostMapping("/user")
    public User add(@Validated(value= UserAdd.class) @RequestBody User user){
        User user1 = userRepo.save(user);
        return user1;
    }

    @PutMapping("/users/{id}")
    public User edit(@Validated(value = UserEdit.class) @RequestBody User user,@PathVariable Long id){
        User user1 = userRepo.save(user);
        return user1;
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable Long id){
        return userRepo.findById(id).get();
    }

    @DeleteMapping("/users/{id}")
    public User del(@PathVariable Long id){
        userRepo.deleteById(id);
        return new User();
    }
}
