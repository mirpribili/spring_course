package com.raw.hibernate.n003a_test_connection;

import com.raw.hibernate.n003a_test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class N7HibernateUpdate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 6);
//            employee.setSalary(1001);
//            employee.setSurname("Depp");
            session.createQuery("update Employee set salary=100500 where firstName = 'lex'").executeUpdate();



            session.getTransaction().commit();
        }finally {
            factory.close();
            session.close();
        }
        System.out.println("Done!");
    }
}
