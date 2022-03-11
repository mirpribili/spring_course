package com.raw.black_belt.nbb008_work_with_files;

import java.io.*;

public class Nbb80DataStream {
    public static void main(String[] args) {
        try(DataOutputStream outputStream =
                    new DataOutputStream(
                            new FileOutputStream(
                                    "resources/mr.bin"));
            DataInputStream inputStream =
                    new DataInputStream(
                            new FileInputStream(
                                    "resources/mr.bin")
                    )
        ) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(400);
            outputStream.writeLong(1_000_000);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(123.321);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
