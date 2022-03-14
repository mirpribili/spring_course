package com.raw.black_belt.nbb008_work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nbb85ChannelBufferAdditionalMethods {
    public static void main(String[] args) {
        try(RandomAccessFile file =
                new RandomAccessFile("resources/Nbb77FileWrite.txt","r");
            FileChannel channel =
                file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println((char)buffer.get());
            System.out.println("--------------------------------");
            buffer.rewind();
            System.out.println((char) buffer.get());
            System.out.println("--------------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char)buffer.get());
            }
            System.out.println("--------------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println("--------------------------------");
            buffer.reset();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
