package rahulmali;

import javax.swing.*;
import java.awt.*;

public class MyTextFeild {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JTextField t1=new JTextField();
        t1.setBounds(10,50,160,30);
        c.add(t1);

        t1.setText("Rahul Mali");
        Font font=new Font("Ariel",Font.PLAIN,30);
        t1.setFont(font);

        t1.setForeground(Color.RED);
        t1.setBackground(Color.BLACK);

        t1.setEditable(false);

        frame.setVisible(true);
    }
}
