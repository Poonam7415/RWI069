package com.oneTomany;

import java.util.ArrayList;
import java.util.List;

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
        Question1 q1 = new Question1();
        q1.setQuestionId(121); // Corrected primary key value
        q1.setQuestion("What is Java?");
        
        // Creating answers
        Answer1 ans = new Answer1();
        ans.setAnswerId(343);
        ans.setAnswer("Java is a programming language");
        
        Answer1 ans2 = new Answer1();
        ans2.setAnswerId(33);
        ans2.setAnswer("With the help of Java, we can create software");
        
        Answer1 ans3 = new Answer1();
        ans3.setAnswerId(34);
        ans3.setAnswer("Java has different types of frameworks");
        
        List<Answer1> list = new ArrayList<>();
        list.add(ans);
        list.add(ans2);
        list.add(ans3);
        
        q1.setAnswers(list);
        
        // Session
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        // Save
        session.save(q1);
        session.save(ans);
        session.save(ans2);
        session.save(ans3);
        
        // Fetching details
        Question1 q = session.get(Question1.class, 1212); // Corrected primary key value
        System.out.println(q.getQuestion());
        
        for (Answer1 a : q.getAnswers()) {
            System.out.println(a.getAnswer());
        }
        
        // Commit transaction
        transaction.commit();
        
        // Close session and factory
        session.close();
        factory.close();
    }
}
