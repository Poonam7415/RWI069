package com.oneTomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Question1 {
    
    @Id
    @Column(name="question_id")
    private int questionId;
    
    private String question;
    
    @OneToMany(mappedBy = "question")
    private List<Answer1> answers;
    
    // Constructors
    public Question1() {
        // Default constructor
    }

    public Question1(int questionId, String question, List<Answer1> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }
    
    // Getters and Setters
    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer1> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer1> answers) {
        this.answers = answers;
    }  
}
