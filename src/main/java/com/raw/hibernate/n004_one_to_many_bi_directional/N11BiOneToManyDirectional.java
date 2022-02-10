package com.raw.hibernate.n004_one_to_many_bi_directional;


import com.raw.hibernate.n004_one_to_many_bi_directional.entity.Employee;
import com.raw.hibernate.n004_one_to_many_bi_directional.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N11BiOneToManyDirectional {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg_one_to_many.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        try {
//            //-----------------------------------
//            // add new department and employees
//            //...................................
//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Zena", "from Ampfipolic", 842);
//            Employee employee2 = new Employee("Gabrielle", "from Potidaea", 688);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department); // сохранение пройдет сразу в 2 ДБ
//            //-----------------------------------

//            //-----------------------------------
//            // get from department all employees
//            //...................................
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            //-----------------------------------

//            //-----------------------------------
//            // get from employee department
//            //...................................
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            //-----------------------------------

//            //-----------------------------------
//            // del employee from employees and department
//            //...................................
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            //session.delete(employee); /// WOW ! удалит все)) тк удаление сотрудника -> удалит департамент -> департамент удалит оставшихся своих сотрудников
//            //-----------------------------------




            session.getTransaction().commit();

        }finally {
            session.close();
            factory.close();
        }
            System.out.println("Done!");
    }
}