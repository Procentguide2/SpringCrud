package com.example.springcrud.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "First name should not be empty")
    @Size(min = 2, message = "First name should be more than 2 characters")
    @Column(name = "first_name")
    private String firstName;

    @NotEmpty(message = "Last name should not be empty")
    @Size(min = 2, message = "Last name should be more than 2 characters")
    @Column(name = "last_name")
    private String lastName;


    @Column(name = "phone")

    private long phone;
}
