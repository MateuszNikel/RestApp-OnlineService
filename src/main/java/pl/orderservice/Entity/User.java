package pl.orderservice.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private static Long seqId = 0L;

    private String name;

    private String login;

    private String password;

    public static Long IncrementId(){
        return seqId++;
    }

    public User(String name){
        this.name = name;
        this.id = IncrementId();
    }

}