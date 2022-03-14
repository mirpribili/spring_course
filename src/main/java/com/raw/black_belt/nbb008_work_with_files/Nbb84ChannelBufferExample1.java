package com.raw.black_belt.nbb008_work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Nbb84ChannelBufferExample1 {
    public static void main(String[] args) {
        try(
                RandomAccessFile file =
                        new RandomAccessFile(
                                "resources/Nbb77FileWrite.txt", "rw");
                FileChannel channel = file.getChannel();) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(25); // при переполнении даст исключение
            StringBuilder stringBuilder = new StringBuilder();
            int byteRead =  channel.read(byteBuffer);
            while (byteRead>0){
                System.out.println("Read" + byteRead);
                byteBuffer.flip(); // переключаем buffer на чтение
                while (byteBuffer.hasRemaining()){
                    stringBuilder.append((char) byteBuffer.get());
                }
                byteBuffer.clear();
                byteRead = channel.read(byteBuffer);
            }
            System.out.println(stringBuilder);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
