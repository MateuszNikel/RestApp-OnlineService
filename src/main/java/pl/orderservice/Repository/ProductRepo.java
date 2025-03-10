package pl.orderservice.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.orderservice.Entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
