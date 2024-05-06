package com.example.usermanagerment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "login")
@Data
public class Login {

    private String email;
    private String password;




}
