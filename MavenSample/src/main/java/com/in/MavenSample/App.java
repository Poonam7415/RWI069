package com.in.MavenSample;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Project Started...");
  
        // Load Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Create session factory
        SessionFactory factory = cfg.buildSessionFactory();

        // Create a new Student object
        Student st = new Student();
        st.setId(106);
        st.setName("John");
        st.setCity("Delhi");
        
        Certificate c1 = new Certificate("java","3months");
        st.setCerti(c1);

        // Print the Student object
        System.out.println(st);
        
        
        // Creating an object of the Address class
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Jaipur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.345);

        // Open a session
        Session session = factory.openSession();

        // Begin transaction
        Transaction tx = session.beginTransaction();

        // Save the Student object
        session.save(st);
        
        // Save the Address object
        session.save(ad);

        // Commit transaction
        tx.commit();

        // Close session
        session.close();
        System.out.println("Done...");

        // Close session factory
        factory.close();
    }
}
