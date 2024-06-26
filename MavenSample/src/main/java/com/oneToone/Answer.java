package com.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
@Id
@Column(name="answer_id")


private int answerId;
private String answer;
@OneToOne
@JoinColumn(name = "question_id")
private Question question;

//Getter and Setter
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

//constructor
public Answer(int answerId, String answer) {
	super();
	this.answerId = answerId;
	this.answer = answer;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}





}
