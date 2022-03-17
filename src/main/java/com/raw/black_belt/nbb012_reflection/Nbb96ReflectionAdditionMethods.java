package com.raw.black_belt.nbb012_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Nbb96ReflectionAdditionMethods {
    public static void main(String[] args) throws
            ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            NoSuchMethodException,
            InvocationTargetException {
        //
        Class employeeClass = Class.forName("com.raw.black_belt.nbb012_reflection.Employee");

        // old way to create of object
//        Employee o = (Employee) employeeClass.newInstance();
//        System.out.println(o);
        // new way
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(1, "Vova", "Governance");
        System.out.println(obj2);
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2,888.1);
        System.out.println(obj2);
    }
}
