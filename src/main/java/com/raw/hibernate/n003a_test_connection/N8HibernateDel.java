package com.raw.hibernate.n003a_test_connection;

import com.raw.hibernate.n003a_test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class N8HibernateDel {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 5);
//            session.delete(employee);


            session.createQuery("delete Employee where firstName = 'Alexandr'");


            session.getTransaction().commit();
        }finally {
            factory.close();
            session.close();
        }
        System.out.println("Done!");
    }
}
