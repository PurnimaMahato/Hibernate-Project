package com.project.hibernetDemo;

// importing org.hibernate classes
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	// Create a configuration object
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

        // Create a session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //create transaction
        Transaction transaction = session.beginTransaction();
        //instantiat Student class
        Student std= new Student();
        std.setSid(34);
        std.setName("Purnima");
        std.setGrade("A");
        std.setEmail("purnima@xyz.com");
        session.save(std);
        System.out.println("Student add hua");
        //closing 
        transaction.commit();
        session.close();
     
        
    }
}
