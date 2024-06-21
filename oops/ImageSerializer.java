package oops;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageSerializer {



    public static void main(String[] args) {

        ImageSerializer  abc = new ImageSerializer();
        System.out.println(abc);




        // Load the image
        BufferedImage image = loadImage("sample.png");

        // Serialize the image
        byte[] serializedImage = serializeImage(image);
        System.out.println("Serialized image size: " + serializedImage.length);

        // Deserialize the image
        BufferedImage deserializedImage = deserializeImage(serializedImage);
        System.out.println("Deserialized image size: " + deserializedImage.getWidth() + "x" + deserializedImage.getHeight());
    }

    private static BufferedImage loadImage(String fileName) {
        try {
            return ImageIO.read(ImageSerializer.class.getResourceAsStream(fileName));
        } catch (IOException e) {
            System.out.println("Error loading image: " + e.getMessage());
            return null;
        }
    }

    private static byte[] serializeImage(BufferedImage image) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            ImageIO.write(image, "png", bos);
            return bos.toByteArray();
        } catch (IOException e) {
            System.out.println("Error serializing image: " + e.getMessage());
            return null;
        }
    }

    private static BufferedImage deserializeImage(byte[] imageBytes) {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes)) {
            return ImageIO.read(bis);
        } catch (IOException e) {
            System.out.println("Error deserializing image: " + e.getMessage());
            return null;
        }
    }
}