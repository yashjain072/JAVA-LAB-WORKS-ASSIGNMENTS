import java.awt.*;
import java.awt.event.*;

class Mycheckbox extends Frame implements ItemListener
{
    String msg="";
    Checkbox c1,c2,c3,c4;
    Mycheckbox()
    {
        setLayout(new FlowLayout());
        
        c1=new Checkbox("Name",true);
        c2=new Checkbox("Enrollment",false);
        c3=new Checkbox("Branch",true);
        c4=new Checkbox("Subject",false);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
public void itemStateChanged(ItemEvent ie)
{
    repaint();
}
public void paint(Graphics g)
{
    g.drawString("Show states:", 15, 80);
    msg="Name:"+c1.getState();
    g.drawString(msg,15,120);
    msg="Enrollment:"+c2.getState();
    g.drawString(msg, 15, 140);
    msg="Branch:"+c3.getState();
    g.drawString(msg, 15, 160);
    msg="Subject"+c4.getState();
    g.drawString(msg,15,180);
}

public static void main(String args[])
{
    Mycheckbox ch=new Mycheckbox();
    ch.setTitle("Checkbox status");
    ch.setSize(450,400);
    ch.setVisible(true);
}
}