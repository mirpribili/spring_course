package com.raw.black_belt.nbb008_work_with_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Nbb77FileWrite {
    public static void main(String[] args) throws IOException {
        BufferedWriter writerBuff = new BufferedWriter(new FileWriter("resources/Nbb77FileWrite.txt"));

        String rubai = "Много текста, мало смысла.\n"+
                "Мало смысла, сколько текста.\n" +
                "Мало текста и нет ни смысла не формы.\n" +
                "Можем мы увидеть смысл по крупице его в тексте?!\n";
        FileWriter writer = null;
        try {
// method 1
            writer = new FileWriter("resources/Nbb77FileWrite.txt"/*, true*/); // append
            for (int i = 0; i<rubai.length(); i++){
                writer.write(rubai.charAt(i));
            }
// method 2
            writer.write(rubai);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }
    }
}
