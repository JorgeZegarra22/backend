package com.example.ecom.entity;


import com.example.ecom.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private UserRole role;

    private String name;

    @Lob
    @Column(columnDefinition = "longblob")
    private  byte[] img;
}
