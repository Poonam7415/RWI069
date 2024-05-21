package com.oneTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer1 {
    @Id
    @Column(name="answer_id")
    private int answerId;
    private String answer;
    
    @ManyToOne
    private Question1 question;

    // Constructors
    public Answer1() {
        // Default constructor
    }

    public Answer1(int answerId, String answer, Question1 question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }

    // Getters and Setters
    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question1 getQuestion() {
        return question;
    }

    public void setQuestion(Question1 question) {
        this.question = question;
    }
}
