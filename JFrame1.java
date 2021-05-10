import javax.swing.*;
import java.awt.*;
public class JFrame1 extends JFrame 
{
    JLabel l;
    JFrame1()
    {
        this.setLayout(new FlowLayout());
        l=new JLabel("Hello! This is the First Java Swing Component Program.");
        l.setAlignmentX(500);
        this.add(l);
        setTitle("Swing JFrame");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new JFrame1();
    }
}
