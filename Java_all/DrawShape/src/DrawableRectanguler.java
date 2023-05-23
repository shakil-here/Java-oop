import java.awt.*;

public class DrawableRectanguler extends DrawableShape {
    public int x;
    public int y;
    public int width;
    public int height;

    public DrawableRectanguler(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    @Override
    public void paintMe(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x,y,width,height);
        g.setColor(Color.black);
        g.fillRect(15,20,15,405);


    }
}
