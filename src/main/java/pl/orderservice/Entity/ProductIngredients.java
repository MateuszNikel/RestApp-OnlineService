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

    private static Long seqId = 0L;

    private String ingredientName;

    private double ingredientPrice;

    public static Long IncrementId(){
        return seqId++;
    }

    public ProductIngredients(String ingredientName, double ingredientPrice){
        this.id = IncrementId();
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
