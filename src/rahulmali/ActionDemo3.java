package rahulmali;
//Action listioner using other class.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RedClass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo3.c.setBackground(Color.RED);
    }
}
class YellowClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo3.c.setBackground(Color.YELLOW);
    }

}
class greenClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo3.c.setBackground(Color.GREEN);
    }
}


public class ActionDemo3 {

    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActioDemo3");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        c = frame.getContentPane();
        c.setLayout(null);

        JButton red = new JButton("Red");
        JButton yellow = new JButton("yellow");
        JButton green = new JButton("green");

        red.setBounds(100, 100, 100, 50);
        yellow.setBounds(250, 100, 100, 50);
        green.setBounds(400, 100, 100, 50);

        c.add(red);
        c.add(yellow);
        c.add(green);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        green.addActionListener(new greenClass());
    }

}


