package pl.orderservice.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.orderservice.Entity.ProductIngredients;

public interface ProductIngredientsRepo extends CrudRepository<ProductIngredients, Long> {
}
