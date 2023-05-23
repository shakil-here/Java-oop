import java.awt.*;

public class DrawableCircle extends DrawableShape{
    public int x;
    public int y;
    public int radius;

    public DrawableCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void paintMe(Graphics g) {
        g.setColor(Color.red);
       // g.drawOval(x,y,radius*2,radius*2);
        g.fillOval(x,y,radius*2,radius*2);

    }
}
