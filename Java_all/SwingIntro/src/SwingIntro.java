import javax.swing.*;

public class SwingIntro {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter Your Name:");
        int age= 20;
        JOptionPane.showMessageDialog(null,"Name: "+name+"."+"\n"+"Age: "+age);
        print(name,age);
    }
    public static void print(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

}
