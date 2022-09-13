import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedImage okno = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        Graphics o = okno.createGraphics();
        Circle circle = new Circle(70, 70, 300, 300);
        Rectangle rectangle = new Rectangle(400, 60, 400, 60 );

        Shape[] shapes = { circle, rectangle};
        for (int i = 0; i < shapes.length; i++){
            shapes[i].draw(o, shapes[i].x, shapes[i].y, shapes[i].a, shapes[i].b);
        }
        File file = new File("Itog.png");
        try {
            ImageIO.write(okno,"png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
