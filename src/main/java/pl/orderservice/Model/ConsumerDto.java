package pl.orderservice.Model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class ConsumerDto {

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String firstName;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String lastName;

    @NotNull
    @NotEmpty
    @Size(min = 9, max = 18)
    private String phoneNumber;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String city;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 18)
    private String postcode;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 80)
    private String street;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 18)
    private String houseNumber;
}
