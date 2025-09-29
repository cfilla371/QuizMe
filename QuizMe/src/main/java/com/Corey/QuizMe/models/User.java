package com.Corey.QuizMe.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Getter
    @Column(unique = true, nullable = false, length = 50)
    private String username;

    @Setter
    @Getter
    @Column(nullable = false, length = 50)
    private String firstName;

    @Setter
    @Getter
    @Column(nullable = false, length = 50)
    private String lastName;

    @Setter
    @Getter
    @Column(nullable = false)
    private Date birthday;


    @Getter
    @Column(nullable = false)
    private String password;
}
