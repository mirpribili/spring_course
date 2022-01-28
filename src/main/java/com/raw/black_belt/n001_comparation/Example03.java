package com.raw.black_belt.n001_comparation;

import java.util.*;

public class Example03 {
    public static void main(String[] args) {
        List<Employee02> list = new ArrayList<>();
        Employee02 emp1 = new Employee02(100, "Zena", "?", 12345);
        Employee02 emp2 = new Employee02(10, "Bob", "Lii", 1234);
        Employee02 emp3 = new Employee02(131, "Bob", "Tramp", 123);
        Employee02 emp4 = new Employee02(133, "Alex", "Smith", 12);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

        System.out.println("Before sorting \n" + list);

        Collections.sort(list);
        Collections.sort(list, new IdComparator());
        Collections.sort(list, new nameComparator());
        Collections.sort(list, new salaryComparator());

        System.out.println("After sorting \n" + list);


        //Arrays.sort(new Employee[] {emp1, emp2, emp3}, new IdComparator());
    }
}

class Employee02 implements Comparable<Employee02> {
    //int id;
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee02(int id, String name, String surname, int salary) {
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
    public int compareTo(Employee02 anotherEmployee) {
        if (this.id == anotherEmployee.id) {
            return 0;
        } else if (this.id < anotherEmployee.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class IdComparator implements Comparator<Employee02>{
    @Override
    public int compare(Employee02 emp1, Employee02 emp2) {
        if (emp1.id == emp2.id){
            return 0;
        }else if (emp1.id < emp2.id){
            return -1;
        }else {
            return 1;
        }
    }
}

class nameComparator implements Comparator<Employee02>{
    @Override
    public int compare(Employee02 emp1, Employee02 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class salaryComparator implements Comparator<Employee02>{
    @Override
    public int compare(Employee02 emp1, Employee02 emp2) {
        return emp1.salary - emp2.salary;
    }
}
