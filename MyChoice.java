import java.awt.*;

public class MyChoice {

    public static void main(String[] args) {
        Label l=new Label("Choose your Sport: ");
        Frame f1;
        f1 = new Frame();
        Choice c =new Choice();
        c.setBounds(100,100,75,75);
        c.add("Cricket");
        c.add("FootBall");
        c.add("Hockey");
        c.add("Badminton");
        f1.add(l);
        f1.add(c);
        f1.setLayout(new FlowLayout());
        f1.setSize(400,400);
        f1.setVisible(true);

    }
}