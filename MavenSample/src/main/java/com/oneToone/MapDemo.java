package com.oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		// Load Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        // Create session factory
        SessionFactory factory = cfg.buildSessionFactory();
        
        // Creating question
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is Java?");
        
        // Creating answer
        Answer ans = new Answer();
        ans.setAnswerId(343);
        ans.setAnswer("Java is a programming language");
        
        // Associating answer with question
         q1.setAnswer(ans); 
         
         
         // Creating question
         Question q2 = new Question();
         q2.setQuestionId(242);
         q2.setQuestion("What is Collection Framework?");
         
         // Creating answer
         Answer answer = new Answer();
         ans.setAnswerId(344);
         ans.setAnswer("API to work with objects in java.");
         
         // Associating answer with question
          q2.setAnswer(answer);  
        
         
         
         
         
         
        // Session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        // Save question
        session.save(q1);
        session.save(q2);
        session.save(ans);
        session.save(answer);
        
        // Commit transaction
        transaction.commit();
        
        // Close session and factory
        session.close();
        factory.close();
	}
}
