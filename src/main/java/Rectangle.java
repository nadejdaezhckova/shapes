import java.awt.*;
public class Rectangle extends Shape{
    public Rectangle(int x, int y, int a, int b ){
        super.a = a;
        super.b = b;
        super.x = x;
        super.y = y;
    }
    @Override
    public void draw(Graphics p, int x, int y, int a, int b) {
        p.drawRect(x, y, a, b);
    }
}
