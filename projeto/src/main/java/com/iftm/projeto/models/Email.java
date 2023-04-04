package com.iftm.projeto.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "email_and_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from", nullable = false, length = 100)
    private String from;
    @Column(name = "to", nullable = false, length = 100)
    private String to;
    @Column(name = "subject", nullable = false, length = 100)
    private String subject;
    @Column(name = "body", nullable = false, length = 100)
    private String body;
    @Column(name = "attachment", nullable = false, length = 100)
    private String attachment;
}
