package pl.orderservice.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.orderservice.Entity.Order;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
