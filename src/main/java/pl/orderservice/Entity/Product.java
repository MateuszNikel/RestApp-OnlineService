package pl.orderservice.Entity;

import lombok.*;
import pl.orderservice.Enums.Size;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private Size size;

    private String productDescription;

    private double price;

    @OneToMany(mappedBy = "product")
    private List<ProductIngredients> productIngredients;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
