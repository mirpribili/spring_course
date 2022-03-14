package com.raw.black_belt.nbb008_work_with_files;

import java.io.File;
import java.util.Arrays;

public class Nbb83ClassFile {
    public static void main(String[] args) {
        File file = new File("resources/Nbb83ClassFile");
        System.out.println(file.getAbsoluteFile());
        File file2 = new File("resources");
        System.out.println(Arrays.stream(file2.listFiles()).findFirst().toString());
        File[] files = file2.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
