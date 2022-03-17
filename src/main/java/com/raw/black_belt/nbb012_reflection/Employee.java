package com.raw.black_belt.nbb012_reflection;

public class Employee {
    public int id;
    public String name;
    public String department;
    private double salary;
    private double graySalary = 1000;

    public Employee(){}

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    private void changeDepartment (String newDepartment){
        department=newDepartment;
        System.out.println("New department is:" + department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void increaseSalary(){
        salary=salary*2;
    }
}
