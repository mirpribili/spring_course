package com.raw.black_belt.nbb008_work_with_files;

import java.io.*;

public class Nbb78FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader readerBuff = new BufferedReader(new FileReader("resources/Nbb77FileWrite.txt"));

        try( FileReader reader = new FileReader("resources/Nbb77FileWrite.txt"))
        {
            int character;
            while ((character=reader.read()) != -1){
                System.out.println((char)character);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
