package com.raw.hibernate.test_connection;

import com.raw.hibernate.test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateSaveToDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            Employee employee = new Employee("Johnny", "Depp", "IT", 500);
            session.beginTransaction();
            session.save(employee); // = INSERT
            session.getTransaction().commit();
        }finally {
            factory.close();
            session.close();
        }

    }
}
