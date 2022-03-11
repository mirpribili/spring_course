package com.raw.black_belt.nbb008_work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Nbb79FileBinary {
    public static void main(String[] args) {
        try(
                FileInputStream inputStream = new FileInputStream(
                        "resources/spring_mvc.jpg"
                );
                FileOutputStream outputStream = new FileOutputStream(
                        "resources/spring_mvc2.jpg"
                )
                ) {
            int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
