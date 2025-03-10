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

    private static Long seqId = 0L;

    private String productName;

    private Size size;

    private String productDescription;

    private double price;

    public static Long IncrementId(){
        return seqId++;
    }

    public Product(String productName, Size size, String productDescription, double price){
        this.id = IncrementId();
        this.productName = productName;
        this.size = size;
        this.productDescription = productDescription;
        this.price = price;
    }

    @OneToMany(mappedBy = "product")
    private List<ProductIngredients> productIngredients;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
