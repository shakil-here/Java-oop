import java.awt.*;
import javax.swing.*;

public class MyFrameTester {
    public static void main(String[] args) {
        MyFrame mf=new MyFrame();
        MyFrame mp= new MyFrame();
        JFrame.getFrames();
        mp.setBackground(Color.red);
        mp.settitle("MP");
        mp.setSize(400,300);
        mp.setVisible(true);
        mf.settitle("Shakil");
        mf.setSize(460,360);
        mf.setIconImage(mf.createImage(17,14));
        mf.setVisible(true);


    }
}
