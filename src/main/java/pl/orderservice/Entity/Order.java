package pl.orderservice.Entity;

import lombok.*;
import pl.orderservice.Enums.PaymentType;
import pl.orderservice.Model.OrderDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity(name = "orders")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static Long seqId = 0L;

    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.DATE)
    private Date completeDate;

    private boolean completed;

    private String orderDescriptions;

    private double orderPrice;

    private PaymentType paymentType;

    private boolean paymentStatus;

    public static Long IncrementId(){
        return seqId++;
    }

    public Order (String orderDescriptions, double orderPrice,PaymentType paymentType){
        this.id = IncrementId();
        this.createDate = new Date();
        this.orderDescriptions = orderDescriptions;
        this.orderPrice = orderPrice;
        this.paymentType = paymentType;
    }

    @OneToMany(mappedBy = "order")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;
}