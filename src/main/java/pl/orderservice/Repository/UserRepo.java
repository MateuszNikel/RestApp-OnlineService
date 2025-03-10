package pl.orderservice.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.orderservice.Entity.User;

public interface UserRepo extends CrudRepository<User, Long> {
}
