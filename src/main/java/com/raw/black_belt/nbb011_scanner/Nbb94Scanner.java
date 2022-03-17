package com.raw.black_belt.nbb011_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Nbb94Scanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter decimal ");
//        int i = scanner.nextInt();
//        System.out.println(i+i);

        Scanner scanner1 = new Scanner("kk pk[k[p k[p\n kkkk");
        while (scanner1.hasNext()){
            System.out.println(scanner1.next());
            System.out.println(scanner1.next().charAt(2));
        }
        scanner1.close();

        Scanner scanner3 = null;
        Set<String> set = new TreeSet<>();
        try {
            scanner3 = new Scanner(new FileReader(
                    new File("resources/Nbb77FileWrite.txt")
            ));
            scanner3.useDelimiter("\\W");
            while (scanner3.hasNext()){
                String word = scanner3.next();
                set.add(word);
            }
            for (String word:set){
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            scanner3.close();
        }
    }
}
