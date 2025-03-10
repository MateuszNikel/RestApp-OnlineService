package pl.orderservice.Model;

import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
public class ProductDto {

    private String productName;

    private String productDescription;

    private BigDecimal price;
}