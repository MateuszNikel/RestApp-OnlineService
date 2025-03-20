package pl.orderservice.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.orderservice.Entity.Product;
import pl.orderservice.Model.ProductDto;
import pl.orderservice.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping("")
    public List<ProductDto> findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDto findProductById(@PathVariable("id") Long id) {
        return productService.findById(id);
    }

    @PostMapping("/add")
    public Product addNewProduct(@RequestBody ProductDto productDto){
        return productService.addNewProduct(productDto);
    }
}
