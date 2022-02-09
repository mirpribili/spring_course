package com.raw.hibernate.n003_relation_to_tables;

import com.raw.hibernate.n003_relation_to_tables.entity.Detail;
import com.raw.hibernate.n003_relation_to_tables.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N10BiDirectional {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg2.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {

            // -------------------------------
//            Employee employee = new Employee("Misha", "Pale", "HR", 850);
//            Detail detail = new Detail("London", "+1 (310) 888-8888", "i@mishanya");
//
//            detail.setEmployee(employee);
//            session.beginTransaction();
//            session.save(detail); // НО НЕ сохранит в details_id !!!
//
//            // ЧИНИМ
//            employee.setEmpDetail(detail);
//
//            session.getTransaction().commit();
            // -------------------------------


//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 5);
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();

            // -------------------------------

//            session.beginTransaction();
//            Detail detail = session.get(Detail.class, 3);
            // we can destroy relation
            //            detail.getEmployee().setEmpDetail(null);
//            session.delete(detail);
//
//            session.getTransaction().commit();

            // -------------------------------



        }finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}