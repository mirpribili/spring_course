package com.raw.hibernate.n003_relation_to_tables;

import com.raw.hibernate.n003_relation_to_tables.entity.Detail;
import com.raw.hibernate.n003_relation_to_tables.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N9UniDirectional {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg2.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {


//            Employee employee = new Employee("Johnny", "Depp", "Actors", 1000_000);
//            Detail detail = new Detail("Owensboro", "+1 (310) 273-6700", "I@johnnydeppweb");

//            Employee employee = new Employee("Brad", "Pitt", "Actors producers", 1000_000);
//            Detail detail = new Detail("Shawnee", "none", "I@bradpitt");

//            employee.setEmpDetail(detail);


            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 2);
//            System.out.println(employee.getEmpDetail());


//            Employee employee = session.get(Employee.class, 2);
//            session.delete(employee);

//            session.save(employee);
            session.getTransaction().commit();
        }finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}