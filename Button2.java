import java.awt.*;
import java.awt.event.*;

public class Button2 extends Frame implements ActionListener
{
    Label l;
    Button b1;
    Button b2;
    NewClass1()
    {
        l=new Label("Choose Background Color");
        b1=new Button("BLACK");
        b2=new Button("RED");
        this.setLayout(new FlowLayout());
        b1.setBounds(0, 0, 10, 50);
        b1.addActionListener(this);
        b2.setBounds(10,10,10,50);
        b2.addActionListener(this);
        this.setTitle("Button Example");
        this.add(l);
        this.add(b1);
        this.add(b2);
        this.setSize(300,300);
        this.setVisible(true);
        addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent we)
           {
               System.exit(0);
           }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
        String str= ae.getActionCommand();
        if(str.equals("BLACK"))
            this.setBackground(Color.BLACK);
        if(str.equals("RED"))
            this.setBackground(Color.RED);
    }
    
    public static void main(String args[])
    {
        new Button2();
    }
}