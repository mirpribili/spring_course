package com.raw.black_belt.nbb012_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Nbb95Reflection {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException {
        // initialization type 1
        Class employeeClass1 = Class.forName("com.raw.black_belt.nbb012_reflection.Employee");
        // initialization type 2
        Class employeeClass2 = Employee.class;
        // initialization type 3
        Employee emp = new Employee();
        Class employeeClass3 = emp.getClass();

        //
        Field someField = employeeClass1.getField("id");
        System.out.println("Type of id field: " + someField.getType());
        Field[] fields = employeeClass1.getFields();
        for (Field field:fields){
            System.out.println("Type of " + field.getName() + " type: " + field.getType());
        }
        System.out.println("----------");
        Field[] fieldsWithPrivate = employeeClass1.getDeclaredFields();
        for (Field field:fieldsWithPrivate){
            System.out.println("Type of " + field.getName() + " type: " + field.getType());
        }
        System.out.println("----------");
        Method someMethod = employeeClass1.getMethod("increaseSalary");
        System.out.println(someMethod.getReturnType());
        System.out.println(Arrays.toString(someMethod.getParameterTypes()));
        System.out.println("----------");
        Method someMethod2 = employeeClass1.getMethod("setSalary", double.class);
        System.out.println(someMethod2.getReturnType());
        System.out.println(Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("----------");
        Method[] methods = employeeClass1.getMethods();
        for (Method method: methods){
            if(Modifier.isPublic(method.getModifiers())) { /// is public?
                System.out.println(
                        method.getName() + " - " +
                                method.getReturnType() + " - " +
                                Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("----------");
        Method[] methodsWithPrivateMethods = employeeClass1.getDeclaredMethods();
        for (Method method: methodsWithPrivateMethods){
            System.out.println(
                    method.getName() + " - " +
                            method.getReturnType() + " - " +
                            Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("-----------------------------------------");
        Constructor constructor1 = employeeClass1.getConstructor();
        System.out.println(constructor1.getParameterCount());
        System.out.println(Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("-----------------------------------------");
        Constructor constructor2 = employeeClass1.getConstructor(int.class, String.class, String.class);
        System.out.println(constructor2.getParameterCount());
        System.out.println(Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("-----------------------------------------");
        Constructor[] constructors = employeeClass1.getConstructors();
    }
}
