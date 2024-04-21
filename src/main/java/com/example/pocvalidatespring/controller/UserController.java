package com.example.pocvalidatespring.controller;


import com.example.pocvalidatespring.dto.UserDtoRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/users")
@RestController
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDtoRequest user) {
        // Procesar el usuario
        return ResponseEntity.ok("Usuario creado correctamente");
    }
}