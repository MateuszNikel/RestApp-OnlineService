package pl.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.orderservice.Entity.Product;
import pl.orderservice.Exception.ObjectNotFoundException;
import pl.orderservice.Model.ProductDto;
import pl.orderservice.Repository.ProductRepo;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ModelMapper modelMapper;

    private final ProductRepo productRepo;

    public ProductDto findById(Long id) {
        Optional<Product> product = productRepo.findById(id);
        return product.map(o -> modelMapper.map(o, ProductDto.class)).orElseThrow(() -> new ObjectNotFoundException("Product with id " + id + " not found"));
    }
}
