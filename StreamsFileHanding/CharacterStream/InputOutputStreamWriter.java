package StreamsFileHanding.CharacterStream;

import java.io.*;
import java.util.Scanner;

public class InputOutputStreamWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input file path: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFilePath = scanner.nextLine();

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(inputFilePath));
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(outputFilePath))) {
            int data;
            while ((data = inputStreamReader.read()) != -1) {
                outputStreamWriter.write(data);
            }
            System.out.println("data  transfered  succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
