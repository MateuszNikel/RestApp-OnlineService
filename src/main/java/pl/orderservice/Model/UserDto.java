package pl.orderservice.Model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDto {

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 99)
    private String name;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 50)
    private String login;

    @NotNull
    @NotEmpty
    @Size(min = 9, max = 35)
    private String password;

    @NotNull
    @NotEmpty
    @Size(min = 9, max = 35)
    private String confirmPassword;
}
