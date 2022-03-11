package com.raw.black_belt.nbb008_work_with_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nbb81Serialization {
    public static void main(String[] args) {
        List<String> employee = new ArrayList<>();
        employee.add("Zeus");
        employee.add("Zerg");
        employee.add("Xena");
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(
                        "resources/mr.bin"
                )
        )) {
            outputStream.writeObject(employee);

            Employee employee1 = new Employee("Zina", "Gum","IT",19,200);
            outputStream.writeObject(employee1);

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class SerializationRead{
    public static void main(String[] args) {
        List<String> employees;
        Employee employee;

        try(ObjectInputStream inputStream =
                new ObjectInputStream(
                        new FileInputStream(
                                "resources/mr.bin")
                )) {
            employees = (ArrayList)inputStream.readObject();
            System.out.println(employees);

            employee = (Employee) inputStream.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class Employee implements Serializable{
    static public long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    int age;
    transient double salary; // сделаем зп анонимной

    public Employee(String name,
                    String surname,
                    String department, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}