package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Box_Layout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Box Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        Container c=frame.getContentPane();

        BoxLayout B=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(B);

        JButton b1= new JButton("Button 1");
        JButton b2= new JButton("Button 2--");
        JButton b3= new JButton("Button 3");
        JButton b4= new JButton("Button 4----");

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);

        c.add(b1);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b2);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b3);
        c.add(Box.createRigidArea(new Dimension(0,20)));
        c.add(b4);
    }
}
