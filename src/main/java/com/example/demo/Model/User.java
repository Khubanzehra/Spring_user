package com.example.demo.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//firstName-when it goes to table it will show first_name


    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    //@Column(name="Password")
    private String password;//default

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")

    private String email;

    @NotNull(message = "userName cannot be null")
    private  String userName;

    @Size(min = 5, message = "PhNo must be at least 5 characters long")
    @NotNull(message = "phonenumber cannot be null")
    private String phNo;


    // Constructors
    public User() {
    }

    public User( String password, String email) {

        this.password = password;
        this.email = email;

    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}