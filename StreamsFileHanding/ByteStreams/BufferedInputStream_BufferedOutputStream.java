package StreamsFileHanding.ByteStreams;

import java.io.*;
import java.util.Scanner;

public class BufferedInputStream_BufferedOutputStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter input file path = ");
        String inputFilePath = scanner.nextLine();

        System.out.print("enter output file path = ");
        String outputFilePath = scanner.nextLine();


    //if we  dont  want  to create  new file  with  only  want  to   send  data  to  exiting   file

//        File outputFile = new File(outputFilePath);
//        if (!outputFile.exists()) {
//            System.out.println("file doesn't exist  " + outputFilePath);
//            return;
//        }

        try (BufferedInputStream readFile = new BufferedInputStream(new FileInputStream(inputFilePath));
             BufferedOutputStream writeFile = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {


            byte[] byteArray = new byte[1024];
            int readData;
            while ((readData = readFile.read(byteArray)) != -1) {
                writeFile.write(byteArray, 0, readData);
            }
            System.out.println("data transfered successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//path  =  C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/input.txt