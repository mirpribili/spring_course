package com.raw.black_belt.nbb003_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Nbb13BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(301);
        arrayList.add(991);
        arrayList.add(71);
        arrayList.add(31);
        arrayList.add(115);
        arrayList.add(10);
        arrayList.add(81);
        arrayList.add(-1);
        arrayList.add(-10);
        int index = Collections.binarySearch(arrayList, 71);
        System.out.println(index);
        Collections.sort(arrayList);
        index = Collections.binarySearch(arrayList, 71);
        System.out.println(index);

        Employee employee1 = new Employee(1, "Ivan", 13000);
        Employee employee2 = new Employee(2, "Vanya", 23000);
        Employee employee3 = new Employee(3, "Poll", 3000);
        Employee employee4 = new Employee(4, "Bob", 43000);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

        Collections.sort(employeeArrayList);
        System.out.println(
                Collections.binarySearch(
                        employeeArrayList,
                        new Employee(4, "Bob", 43000)
                        )
        );

        int[]array = {-1,4,54,2,6346,-34,-64356,9};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 9));
        
    }
}
class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}