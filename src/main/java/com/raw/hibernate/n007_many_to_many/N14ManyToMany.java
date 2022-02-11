package com.raw.hibernate.n007_many_to_many;

import com.raw.hibernate.n007_many_to_many.entity.Child;
import com.raw.hibernate.n007_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N14ManyToMany {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            //-----------------------------------
            // add new section and children's
            //...................................
//            Section section = new Section("Football");
//            Child child1 = new Child("Xenos",5000);
//            Child child2 = new Child("Hulk",50);
//            Child child3 = new Child("Drake",5);
//            section.addChildToSection(child1);
//            section.addChildToSection(child2);
//            section.addChildToSection(child3);
//
//            session.beginTransaction();
//            session.save(section); // сохранение пройдет сразу в 3 ДБ
            //-----------------------------------


            //-----------------------------------
            // get from section all children's
            //...................................
//            session.beginTransaction();
//            Section section1 = new Section("Kendo");
//            Section section2 = new Section("Kempo");
//            Child child = session.get(Child.class,1);
//            child.addSectionToChild(section1);
//            child.addSectionToChild(section2);
//
//            session.save(child);
//            session.persist(child); /// !!!!!!!!!!!!!!!!!!!!!!
//
//            session.getTransaction().commit();
            //-----------------------------------


//            //-----------------------------------
//            // get from children section
//            //...................................
//            session.beginTransaction();
//            Section section = session.get(Section.class,1);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            //-----------------------------------


//            //-----------------------------------
//            // get from  section children
//            //...................................
            session.beginTransaction();
            Child child = session.get(Child.class,1);
            System.out.println(child.getSections());
            session.getTransaction().commit();
//            //-----------------------------------


//            //-----------------------------------
//            // del employee from employees and department
//            //...................................
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            //session.delete(employee); /// WOW ! удалит все)) тк удаление сотрудника -> удалит департамент -> департамент удалит оставшихся своих сотрудников
//            session.getTransaction().commit();
//            //-----------------------------------





        }finally {
            session.close();
            factory.close();
        }
        System.out.println("Done!");
    }
}
