package com.Corey.QuizMe.models.quizmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "quizes")
@Entity
public class Quiz {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    @Getter
    @Setter
    private String quizName;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;





}
