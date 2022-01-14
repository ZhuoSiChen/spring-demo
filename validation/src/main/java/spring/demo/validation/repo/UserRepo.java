package spring.demo.validation.repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import spring.demo.validation.entity.User;


@Repository
public interface UserRepo extends PagingAndSortingRepository<User, Long> {

}
