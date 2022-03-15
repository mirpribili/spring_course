package com.raw.black_belt.nbb008_work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Nbb90DeleteFiles {
    public static void main(String[] args) throws IOException {
        Path destination = Paths.get("resources/Nbb89CopyFileTree");
        Files.walkFileTree(destination, new MyFileVisitorDelete());
    }
}
class MyFileVisitorDelete extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file name: " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete directory: " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}