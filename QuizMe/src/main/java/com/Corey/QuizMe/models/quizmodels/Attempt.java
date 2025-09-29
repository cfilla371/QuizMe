package com.Corey.QuizMe.models.quizmodels;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "attempts")
public class Attempt {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
}
