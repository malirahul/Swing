package rahulmali;

import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.blue);

        JTextArea text=new JTextArea();
        text.setBounds(100,100,400,200);
        c.add(text);

        text.setText("This is a Text Area");
        text.setFont((new Font("Arial",Font.BOLD,15)));

        text.setLineWrap(true);

        frame.setVisible(true);
    }
}
