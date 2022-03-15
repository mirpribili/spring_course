package com.raw.black_belt.nbb008_work_with_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Nbb86PathAndFiles {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("resources/Nbb77FileWrite.txt");
        Path directoryPath = Paths.get("resources");

        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("----------------------------------");
        System.out.println(filePath.getParent());
        System.out.println(directoryPath.toAbsolutePath());
        System.out.println("----------------------------------");
        System.out.println(directoryPath.resolve(filePath));
        System.out.println(directoryPath);
        System.out.println("----------------------------------");
        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getRoot());
        System.out.println("---------------------------------- 1 ");




        System.out.println(directoryPath.relativize(filePath));
        System.out.println("----------------------------------");
        if(!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        System.out.println(Files.size(filePath));
        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println("----------------------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");
        for (Map.Entry<String, Object>  entry: attributes.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        System.out.println(directoryPath.toAbsolutePath().getRoot());
//        System.out.println("----------------------------------");
//        System.out.println(filePath.toAbsolutePath().getParent());
//        System.out.println(directoryPath.toAbsolutePath().getRoot());
//        System.out.println("----------------------------------");
    }
}
