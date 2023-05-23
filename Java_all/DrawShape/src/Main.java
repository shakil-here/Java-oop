import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Painter p=new Painter();
        DrawableRectanguler r=new DrawableRectanguler(20,20,300,180);
        DrawableCircle c=new DrawableCircle(125,65,50);
        p.addShape(r);
        p.addShape(c);
        JFrame myframe= new JFrame();
        myframe.setTitle("Painter");
        myframe.setSize(500,500);
        myframe.setContentPane(p);
        myframe.setVisible(true);

    }
}
