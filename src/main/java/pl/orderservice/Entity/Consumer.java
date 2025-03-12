package pl.orderservice.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static Long seqIq = 0L;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String city;

    private String postcode;

    private String street;

    private String houseNumber;

    public static Long incrementId() {
        return seqIq++;
    }

    public Consumer addNewId(){
        this.id = incrementId();
        return this;
    }

    public Consumer(String firstName, String lastName, String phoneNumber, String city, String postcode, String street, String houseNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.postcode = postcode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.id = incrementId();
    }

    @OneToMany(mappedBy = "consumer")
    private List<Order> order;
}
