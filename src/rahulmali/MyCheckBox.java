package rahulmali;

import javax.swing.*;
import java.awt.*;

public class MyCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JCheckBox c1=new JCheckBox("High School");
        JCheckBox c2=new JCheckBox("Intermediate");
        JCheckBox c3=new JCheckBox("Graduation");
        JCheckBox c4=new JCheckBox("Post Graduation");

        c1.setBounds(100,50,200,20);
        c2.setBounds(100,100,200,20);
        c3.setBounds(100,150,200,20);
        c4.setBounds(100,200,200,20);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);
        c4.setEnabled(false);

        Font f=new Font("Ariel",Font.ITALIC,20);
        c1.setFont(f);
        c2.setFont(f);
        c3.setFont(f);
        c4.setFont(f);


        frame.setVisible(true);
    }
}