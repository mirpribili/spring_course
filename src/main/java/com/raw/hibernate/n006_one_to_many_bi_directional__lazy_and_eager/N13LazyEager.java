package com.raw.hibernate.n006_one_to_many_bi_directional__lazy_and_eager;


import com.raw.hibernate.n006_one_to_many_bi_directional__lazy_and_eager.entity.Department;
import com.raw.hibernate.n006_one_to_many_bi_directional__lazy_and_eager.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class N13LazyEager {
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
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee1 = new Employee("Xena", "from Ampfipolic", 800);
//            Employee employee2 = new Employee("Gabriell", "from Potidaea", 1200);
//            Employee employee3 = new Employee("Heracles", "from Fiva", 1500);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//            session.save(department); // сохранение пройдет сразу в 2 ДБ
            //-----------------------------------


            //-----------------------------------
            // get from department all employees
            //...................................
            session.beginTransaction();
            Department department = session.get(Department.class, 3);
            System.out.println(department);
            System.out.println(department.getEmps().get(0)); // только, для того чтобы подгрузить данные
            session.getTransaction().commit();
            System.out.println(department.getEmps()); // теперь сотрудники доступны даже после commit
            //-----------------------------------


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