package com.backend.SyncIT.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class CreateUserDTO {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String enterprise;

    public @NotBlank(message = "Nome é obrigatório") @Size(min = 2, message = "O nome deve ter pelo menos 2 caracteres") String getName() {
        return name;
    }

    public @NotBlank(message = "Sobrenome é obrigatório") @Size(min = 2, message = "O sobrenome deve ter pelo menos 2 caracteres") String getLastName() {
        return lastName;
    }

    public @NotBlank(message = "E-mail é obrigatório") @Email(message = "E-mail deve ser válido") String getEmail() {
        return email;
    }

    public @NotBlank(message = "Senha é obrigatória") @Size(min = 6, message = "A senha deve ter pelo menos 6 caracteres") String getPassword() {
        return password;
    }

    public @NotBlank(message = "O número de telefone é obrigatório") @Size(min = 14, message = "O número de telefone deve ter pelo menos 14 caracteres") String getPhoneNumber() {
        return phoneNumber;
    }

    public @Size(min = 2, message = "A empresa deve ter pelo menos 2 caracteres") String getEnterprise() {
        return enterprise;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
