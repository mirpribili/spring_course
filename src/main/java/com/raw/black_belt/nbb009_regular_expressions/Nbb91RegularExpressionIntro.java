package com.raw.black_belt.nbb009_regular_expressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nbb91RegularExpressionIntro {
    public static void main(String[] args) {
        String s1 =
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                "email: vivanov@ya.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                "email: vivanov@ya.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                "email: vivanov@ya.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, flat 48," +
                "email: vivanov@ya.ru, Postcode: AA99, Phone Number: +123456789;"
                ;

        String s2 = "ABCD ABCE ABCFABCGABCABCDH";
        Pattern pattern1 = Pattern.compile("ABCD");
        Matcher matcher1 = pattern1.matcher(s2);
        while (matcher1.find()){
            System.out.println(matcher1.start() + " " + matcher1.group());
        }

//        Pattern pattern2 = Pattern.compile("\\w+");
        Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b");

        Matcher matcher2 = pattern2.matcher(s1);
        while (matcher2.find()){
            System.out.println(matcher2.group());
        }

        String s3 = "vivanov@ya.ru";
        boolean result = s3.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s1.split(" ");
        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------");
        s1 = s1.replace("Ivanov", "Javeline8");
        s1 = s1.replaceAll("Javeline[0-9]", "Ivanov");
        System.out.println(s1);
        System.out.println("------------------------------");
        String s4 = "123456789123456789";
        Pattern pattern4 = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})");
        Matcher matcher4 = pattern4.matcher(s4);
        String myNewString = matcher4.replaceAll("$3 $2 $1");
        System.out.println(myNewString);

        Matcher matcher5 = pattern4.matcher(s4);

        while (matcher5.find()){
            System.out.println(matcher5.group(1));
        }
        System.out.println("------------------------------");
        System.out.printf("%-1s \t %08.1f", "Javelin", 3.1415);
        System.out.println("\n------------------------------");
        String result2 = String.format("%-1s \t %08.1f", "Javelin", 3.1415);
        System.out.println(result2);
    }
}
