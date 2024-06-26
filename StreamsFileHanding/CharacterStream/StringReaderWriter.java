package StreamsFileHanding.CharacterStream;

import java.io.*;
import java.util.Scanner;

public class StringReaderWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input file path: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFilePath = scanner.nextLine();

        try (StringReader stringReader = new StringReader(readFileContents(inputFilePath))) {
            int c;
            while ((c = stringReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 

        try (StringWriter stringWriter = new StringWriter()) {
            stringWriter.write(readFileContents(inputFilePath));
            writeToFile(outputFilePath, stringWriter.toString());
            System.out.println("Data written to StringWriter and output file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFileContents(String filePath) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private static void writeToFile(String filePath, String content) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
