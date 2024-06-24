package StreamsFileHanding.ByteStreams;

import java.io.*;
import java.util.Scanner;

public class DataInputStream_DataOutputStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input file path: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFilePath = scanner.nextLine();

        try (DataInputStream readFile = new DataInputStream(new FileInputStream(inputFilePath));
             DataOutputStream writeFile = new DataOutputStream(new FileOutputStream(outputFilePath))) {

            // Read the data from the input file
            int i = readFile.readInt();
            double d = readFile.readDouble();
            boolean b = readFile.readBoolean();
//            String s = readFile.readUTF();

            // Write the data to the output file
            writeFile.writeInt(i);
            writeFile.writeDouble(d);
            writeFile.writeBoolean(b);
//            writeFile.writeUTF(s);

            System.out.println("data copied from   successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

