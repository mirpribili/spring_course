package com.raw.black_belt.nbb008_work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Nbb82RandomAccessFile {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                new RandomAccessFile(
                        "resources/Nbb77FileWrite.txt", "rw")) {
            int a = file.read();
            System.out.println((char) a);

            System.out.println(file.readLine());

            file.seek(101);
            System.out.println(file.readLine());

            System.out.println(file.getFilePointer());

            file.seek(file.length()-1);

            file.writeBytes("\n\t\t\tAgent Smith");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
