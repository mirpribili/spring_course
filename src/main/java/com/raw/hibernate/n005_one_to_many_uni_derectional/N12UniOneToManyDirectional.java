package com.raw.hibernate.n005_one_to_many_uni_derectional;


import com.raw.hibernate.n005_one_to_many_uni_derectional.entity.Department;
import com.raw.hibernate.n005_one_to_many_uni_derectional.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N12UniOneToManyDirectional {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_one_to_many.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
            //-----------------------------------
            // add new department and employees
            //...................................
//            Department department = new Department("Normal", 500, 1500);
//            Employee employee1 = new Employee("Diablo", "Lord of Terror", 800);
//            Employee employee2 = new Employee("Baal", "Lord of Destruction", 1000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department); // сохранение пройдет сразу в 2 ДБ
            //-----------------------------------

            //-----------------------------------
            // get from department all employees
            //...................................
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
            //-----------------------------------

            //-----------------------------------
            // get from employee department
            //...................................
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
            //-----------------------------------

            //-----------------------------------
            // del employee from employees and department
            //...................................
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
            //session.delete(employee); /// каскадное удаление для департамента НО НЕ для работника!
            //-----------------------------------




            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }
            System.out.println("Done!");
    }
}