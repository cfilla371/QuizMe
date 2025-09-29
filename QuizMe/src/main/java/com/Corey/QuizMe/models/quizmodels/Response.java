package com.Corey.QuizMe.models.quizmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Getter
    @Setter
    private String submittedAnswer;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question question;

}