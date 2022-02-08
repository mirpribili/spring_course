package com.raw.hibernate.test_connection;

import com.raw.hibernate.test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class N4HibernateSaveToDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            //Employee employee = new Employee("Johnny", "Depp", "IT", 500);
            Employee employee = new Employee("lex", "Luthor", "HR", 1000);
            session.beginTransaction();
            session.save(employee); // = INSERT
            session.getTransaction().commit();

            System.out.println("Done!");
            System.out.println(employee);
        }finally {
            factory.close();
            session.close();
        }

    }
}
