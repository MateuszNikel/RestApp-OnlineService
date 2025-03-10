package pl.orderservice.Entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class ProductIngredients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ingredientName;

    private double ingredientPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
