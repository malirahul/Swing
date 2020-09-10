package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout extends JFrame {

    JButton b1=new JButton("Button 1");
    JButton b2=new JButton("Button 2");
    JButton b3=new JButton("Button 3");
    JButton b4=new JButton("Button 4");
    JButton b5=new JButton("Button 5");

    public Flow_Layout(){
        setTitle("Flow Layout");
        setBounds(300,200,500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c= getContentPane();

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5,0);

        FlowLayout F=new FlowLayout(FlowLayout.CENTER,10,20);
        c.setLayout(F);
    }

    public static void main(String[] args) {
        new Flow_Layout();
    }
}
