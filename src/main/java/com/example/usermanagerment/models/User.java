package com.example.usermanagerment.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name= "users")
@Data
public class User {
    @Id
    private int user_id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private Date created_at;
    @Transient
    private Date updated_at;
}
