package StreamsFileHanding.CharacterStream;

import java.io.*;
import java.util.Scanner;

public class FileReaderWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input file path: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFilePath = scanner.nextLine();

        try (FileReader fileReader = new FileReader(inputFilePath);
             FileWriter fileWriter = new FileWriter(outputFilePath)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                fileWriter.write(data);
            }
            System.out.println("data transferred successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
