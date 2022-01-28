package com.raw.black_belt.n001_comparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zena", "?", 12345);
        Employee emp2 = new Employee(10, "Bob", "Lii", 12345);
        Employee emp3 = new Employee(131, "Bob", "Tramp", 12345);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before sorting \n" + list);

        Collections.sort(list); // need implements Comparable interface

        System.out.println("After sorting \n" + list);

        // But even so we can't do it without implement interface
        Arrays.sort(new Employee[] {emp1, emp2, emp3});
    }
}

class Employee implements Comparable<Employee>{
    //int id;
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id){
//            return 0;
//        }else if (this.id < anotherEmployee.id){
//            return -1;
//        }else {
//            return 1;
//        }

//        return this.id - anotherEmployee.id;
//        return this.id.compareTo(anotherEmployee.id);
//        return this.name.compareTo(anotherEmployee.name);
        int res = this.name.compareTo(anotherEmployee.name);
        if(res == 0){
            res = this.surname.compareTo(anotherEmployee.surname);
        }
        return res;
    }
}