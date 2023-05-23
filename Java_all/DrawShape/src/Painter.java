import java.awt.*;

public class Painter extends Container {
   public DrawableShape []array=new DrawableShape[10];
    public int size=0;

    public Painter() {

    }

    public void addShape(DrawableShape s){
        array[size]=s;
        size++;
    }

    public void paint(Graphics g){
        for (int s=0;s<size;s++){
             array[s].paintMe(g);
        }
    }



}
