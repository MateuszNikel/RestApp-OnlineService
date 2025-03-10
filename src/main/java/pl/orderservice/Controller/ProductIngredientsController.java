package pl.orderservice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.orderservice.Model.ProductIngredientsDto;
import pl.orderservice.service.ProductIngredientsService;

@RestController
@RequiredArgsConstructor
public class ProductIngredientsController {

    private final ProductIngredientsService productIngredientsService;

    @GetMapping("/productIngredient/{id}")
    public ProductIngredientsDto findProductIngredientsById(@PathVariable("id") Long id) {
        return productIngredientsService.findById(id);
    }
}
