import java.awt.*;
import java.awt.event.*;

class Myradio extends Frame implements ItemListener
{
    String msg="";
    CheckboxGroup cbg;
    Checkbox y,n,m;
    Label l;
    Myradio()
    {
        setLayout(new FlowLayout());
        
        cbg=new CheckboxGroup();
        l=new Label("Gender: ");
        y=new Checkbox("Male",cbg,true);
        n=new Checkbox("Female",cbg,false);
        m=new Checkbox("Others",cbg,false);
        add(y);
        add(n);
        add(m);
        y.addItemListener(this);
        n.addItemListener(this);
        m.addItemListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
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
    msg="Gender Selected: ";
    msg+=cbg.getSelectedCheckbox().getLabel();
    g.drawString(msg, 15, 120);
}
public static void main(String args[])
{
    Myradio b=new Myradio();
    b.setSize(450, 450);
    b.setTitle("Radio with Action");
    b.setVisible(true);
}
}