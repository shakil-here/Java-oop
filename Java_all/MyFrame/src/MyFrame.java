import javax.swing.JFrame;
public class MyFrame extends JFrame {
    private String title;


    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        super.setTitle(title);
    }

}
