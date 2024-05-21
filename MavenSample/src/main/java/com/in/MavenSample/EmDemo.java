package com.in.MavenSample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

    public static void main(String[] args) {
        // Load Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Create session factory
        SessionFactory factory = cfg.buildSessionFactory();
        Student student1 = new Student();
        student1.setId(203);
        student1.setName("Poonam");
        student1.setCity("Indore");

        Certificate certificate = new Certificate();
        certificate.setCourse("android");
        certificate.setDuration("2 months");

        student1.setCerti(certificate);

        Student student2 = new Student();
        student2.setId(202);
        student2.setName("Renu");
        student2.setCity("Rewa");

        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Hibernate");
        certificate2.setDuration("3 months");

        student2.setCerti(certificate2); // corrected: changed setCerti(certificate) to setCerti(certificate2)

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        // save objects
        s.save(student1);
        s.save(student2);

        tx.commit();
        s.close();
        factory.close();
    }
}
