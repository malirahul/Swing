package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        frame.setTitle("JPanel");
        Container c=frame.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,300,300);
        panel1.setBackground(Color.YELLOW);
        panel1.setLayout(null);
        c.add(panel1);

        JPanel panel2=new JPanel();
        panel2.setBounds(0,0,200,200);
        panel2.setBackground(Color.RED);
        panel1.add(panel2);

        JButton b=new JButton("Button");
        panel2.add(b);
        
    }
}
