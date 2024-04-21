package com.example.pocvalidatespring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDtoRequest {
    @NotNull
    @NotBlank
    String name;
}
