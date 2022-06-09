package kg.kuraido.acceptorinfinity.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AccountDto {
    @NotNull
    @NotEmpty
    private String name;


    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;
    @NotNull
    @NotEmpty
    private String email;





}
