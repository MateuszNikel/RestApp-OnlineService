package pl.orderservice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.orderservice.Model.ProductDto;
import pl.orderservice.service.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    public ProductDto findProductById(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
}
