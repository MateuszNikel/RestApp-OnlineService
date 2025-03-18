package pl.orderservice.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;



@Table(name="consumer")
@Entity
@Data
@NoArgsConstructor
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String city;

    private String postcode;

    private String street;

    private String houseNumber;

    @OneToMany(mappedBy = "consumer")
    private List<Order> order;

}
