package com.raw.black_belt.nbb008_work_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Nbb78FileRead {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("resources/Nbb77FileWrite.txt");
            int character;
            while ((character=reader.read()) != -1){
                System.out.println((char)character);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }
}
