package com.raw.black_belt.nbb012_reflection;

import java.lang.reflect.Field;

public class Nbb97ReflectionChangePrivateField {
    public static void main(String[] args) throws
            NoSuchFieldException,
            IllegalAccessException {
        Employee employee = new Employee(10, "Xenos", "Terror");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("graySalary");
        // change accessible!!!!
        field.setAccessible(true);
        field.set(employee, 1500);
        double graySalaryValue = (Double) field.get(employee);
        System.out.println(graySalaryValue);

    }
}
