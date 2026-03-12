package com.example.SecurityLombokValidation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name Cannot be Blank")
    @Size(min = 3, message = "Name Must be above 3 letters")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "product Cannot be Blank")
    @Column(nullable = false)
    private String product;

    @NotNull(message = "Price Must be given")
    @Column(nullable = false)
    private Long price;
}
