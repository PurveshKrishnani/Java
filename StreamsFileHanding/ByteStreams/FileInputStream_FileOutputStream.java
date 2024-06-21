package StreamsFileHanding.ByteStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_FileOutputStream {

    public  static  void main(String args[]) throws FileNotFoundException {
        try(FileInputStream readFile = new FileInputStream("C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/input.txt")) {
            byte[]  byteArray = new byte[1024];
            int readData ;
            while((readData = readFile.read(byteArray)) != -1){
                System.out.write(byteArray , 0,readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (FileInputStream readFile = new FileInputStream("C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/input.txt")) {
            try (FileOutputStream writeFile = new FileOutputStream("C:/Users/PurveshKrishnani/Desktop/Info services/StreamsFileHanding/output.txt")) {
                byte[] byteArray = new byte[1024];
                int readData;
                while ((readData = readFile.read(byteArray)) != -1) {
                    writeFile.write(byteArray, 0, readData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
