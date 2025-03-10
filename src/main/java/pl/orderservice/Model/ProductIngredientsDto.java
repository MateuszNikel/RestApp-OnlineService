package pl.orderservice.Model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductIngredientsDto {

    private Long id;

    private String ingredientName;

    private BigDecimal ingredientPrice;
}
