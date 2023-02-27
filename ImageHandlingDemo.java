import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageHandlingDemo {
    public static void main(String[] args) {
        int Width = 963;
        int height = 640;

        BufferedImage image = null;
        image = readFromFile(Width, height, image);
        WriteToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
        try {
            File sampleFile = new File("C:\\Users\\nawaz.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            //Reading input file
            image = ImageIO.read(sampleFile);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    private static void WriteToFile(BufferedImage image) {
        try {
            File output = new File("C:\\program1\\ou.jpg");
            ImageIO.write(image, "jpg", output);

            System.out.println("Writing complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
