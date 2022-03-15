package com.raw.black_belt.nbb008_work_with_files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Nbb89CopyFileTree {
    public static void main(String[] args) throws IOException {
        // COPY FILES
        Path source = Paths.get("resources/Nbb83ClassFile");
        Path destination = Paths.get("resources/Nbb89CopyFileTree");
        Files.walkFileTree(source, new MyFileVisitor2(source, destination));
    }
}
class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Enter to Directory: " + dir);
        Path newDestination = destination.resolve(source.relativize(dir));
        /*
        * source = "resources/Nbb83ClassFile"
        * destination = "resources/Nbb89CopyFileTree"
        * source.relativize(dir) == oh1
         */
        Files.copy(dir,newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File name: " + file.getFileName());
        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file,newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}
