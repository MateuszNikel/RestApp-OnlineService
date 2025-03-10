package pl.orderservice.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.orderservice.Entity.Consumer;

public interface ConsumerRepo extends CrudRepository<Consumer, Long> {
}
