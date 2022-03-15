package com.raw.black_belt.nbb008_work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Nbb87PathAndFilesCopyWrite {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("resources/Nbb77FileWrite.txt");
        Path directoryPath = Paths.get("resources");
        Files.copy(filePath,directoryPath.resolve(filePath.getFileName()), StandardCopyOption.REPLACE_EXISTING);

        Path file2Path = Paths.get("resources/Nbb87PathAndFilesCopyWrite.txt");
        String string = "asdasdf\njkl;\n123\n321";
//        Files.write(file2Path, string.getBytes());
        List<String> list = Files.readAllLines(file2Path);
        System.out.println(list);
        for (String s: list){
            System.out.println(s);
        }
        Files.d
        System.out.println("Done");
    }
}
