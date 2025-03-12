package pl.orderservice.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.orderservice.Enums.PaymentType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;



@Entity(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date completeDate;

    private boolean completed;

    private String orderDescriptions;

    private double orderPrice;

    private PaymentType paymentType;

    private boolean paymentStatus;

    @OneToMany(mappedBy = "order")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

}