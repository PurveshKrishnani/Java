package StreamsFileHanding.CharacterStream;

import java.io.*;
import java.util.Scanner;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input file path: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFilePath = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Data transferred using BufferedReader and BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
