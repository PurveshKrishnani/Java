package StreamsFileHanding.ByteStreams;

import java.io.*;

public class ByteArrayInputStream_ByteArrayOutputStream {

    private static void writeBytesToFile (String filePath,byte[] data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data);
        }
    }

    private static byte[] readBytesFromFile (String filePath) throws IOException {
        try (ByteArrayOutputStream writeFile = new ByteArrayOutputStream()) {
            try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
                // FileInputStream  used to read   raw  bytes data
                byte[] byteArray = new byte[1024];
                int readData;
                while ((readData = fileInputStream.read(byteArray)) != -1) {
                    writeFile.write(byteArray, 0, readData);
                }
            }
            return writeFile.toByteArray();
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/input.txt";
        String outputFilePath = "C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/output.txt";

        try {
            byte[] inputData = readBytesFromFile(inputFilePath);
            writeBytesToFile(outputFilePath, inputData);
            System.out.println("data  is transfered ");
        } catch (IOException e) {
            System.err.println("data  is not  transfered  " + e.getMessage());
        }
    }
}

