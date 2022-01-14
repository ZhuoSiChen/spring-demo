package spring.demo.validation.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import spring.demo.validation.entity.Order;

public interface OrderRepo extends PagingAndSortingRepository<Order, Integer> {
}
