package com.raw.hibernate.test_connection;

import com.raw.hibernate.test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class N6HibernateGetAllEmployees {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee " + "where name = 'lex' AND salary > 500").getResultList();

            for (Employee e: emps)
                System.out.println(e);

            session.getTransaction().commit();

        }finally {
            factory.close();
            session.close();
        }
        System.out.println("Done!");
    }
}
