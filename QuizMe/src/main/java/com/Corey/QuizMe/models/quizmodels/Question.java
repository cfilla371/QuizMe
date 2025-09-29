package com.Corey.QuizMe.models.quizmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @Getter
    @Setter
    private String questionText;

    @Getter
    @Setter
    private String answerText;

    @OneToOne(mappedBy = "question")
    private Response response;

}
