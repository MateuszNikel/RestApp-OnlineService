package pl.orderservice.Model;

import lombok.Data;
import pl.orderservice.Entity.Product;
import pl.orderservice.Enums.PaymentType;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
public class OrderDto {

    @NotNull
    @NotEmpty
    private Date createDate;

    @NotNull
    @NotEmpty
    private String orderDescriptions;

    @NotNull
    @NotEmpty
    private List<Product> listOfProductsInOrder;

    @NotEmpty
    private PaymentType paymentType;

    @NotNull
    @NotEmpty
    private ConsumerDto consumer;

    @NotNull
    @NotEmpty
    private UserDto user;
}
