import java.awt.*;
import java.awt.event.*;

public class MyTextField
{
    Frame f1=new Frame("Text Field");
    TextField t1=new TextField(20);
    TextField t2=new TextField(20);
    TextField t3=new TextField(20);
    TextField t4=new TextField(20);
    Label l1=new Label("Name");
    Label l2=new Label("Enrollment No.");
    Label l3=new Label("Subject");
    Label l4=new Label("Branch");
    MyTextField()
    {
        l1.setBounds(70,90,90,60);
        l2.setBounds(70,130,90,60);
        l3.setBounds(70,170,90,60);
        l4.setBounds(70,210,90,60);
        t1.setBounds(200,110,150,20);
        t2.setBounds(200, 150, 150, 20);
        t3.setBounds(200,190,150,20);
        t4.setBounds(200,230,150,20);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.setLayout(null);
        f1.add(t4);
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        MyTextField tf1=new MyTextField();
    }
}