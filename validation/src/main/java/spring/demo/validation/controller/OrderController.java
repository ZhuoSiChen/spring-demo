package spring.demo.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.demo.validation.entity.Order;
import spring.demo.validation.repo.OrderRepo;



@RestController
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @PostMapping("/orders")
    public Order add(@Validated @RequestBody Order order){
        Order order1 = orderRepo.save(order);
        return order1;
    }

    @GetMapping("/orders")
    public Page<Order> page(Pageable pageable){
        return orderRepo.findAll(pageable);
    }

}
