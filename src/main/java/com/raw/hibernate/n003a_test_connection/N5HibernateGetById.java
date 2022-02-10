package com.raw.hibernate.n003a_test_connection;

import com.raw.hibernate.n003a_test_connection.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class N5HibernateGetById {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            //Employee employee = new Employee("Johnny", "Depp", "IT", 500);
            //Employee employee = new Employee("Elena", "Petrova", "Sales", 800);
            Employee employee = new Employee("Oleg", "Petrov", "Java", 100_000); // 22 02 08
            session.beginTransaction();
            session.save(employee); // = INSERT
//            session.getTransaction().commit();

            //System.out.println(employee);

            int myId = employee.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employeeLoaded = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employeeLoaded);

            System.out.println("Done!");
        }finally {
            factory.close();
            session.close();
        }

    }
}
