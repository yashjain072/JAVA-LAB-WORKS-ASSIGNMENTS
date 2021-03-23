import java.awt.*;

public class NewClass1
{
    Frame f;
    Button b1;
    Button b2;
    NewClass1()
    {
        f=new Frame();
        b1=new Button("Submit");
        b2=new Button("Cancel");
        f.setLayout(new FlowLayout());
        b1.setBounds(0, 0, 10, 50);
        b2.setBounds(10,10,10,50);
        f.setTitle("Button Example");
        f.add(b1);
        f.add(b2);
        f.setSize(300,300);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new NewClass1();
    }
}