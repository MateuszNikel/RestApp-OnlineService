package pl.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.orderservice.Entity.ProductIngredients;
import pl.orderservice.Exception.ObjectNotFoundException;
import pl.orderservice.Model.ProductIngredientsDto;
import pl.orderservice.Repository.ProductIngredientsRepo;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductIngredientsService {

    private final ModelMapper modelMapper;

    private final ProductIngredientsRepo productIngredientsRepo;

    public ProductIngredientsDto findById(Long id) {
        Optional<ProductIngredients> productIngredients = productIngredientsRepo.findById(id);
        return productIngredients.map(o -> modelMapper.map(o, ProductIngredientsDto.class)).orElseThrow(() -> new ObjectNotFoundException("Product ingredients with id " + id + " not found"));
    }
}
