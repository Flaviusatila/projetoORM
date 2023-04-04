package com.iftm.projeto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_and_email")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 100)
    private String fistName;
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;
    @Column(name = "user_name", nullable = false, length = 100)
    private String userName;
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Column(name = "phone", nullable = false, length = 100)
    private String phone;
    @Column(name = "social_network", nullable = false, length = 100)
    private String socialNetwork;

}
