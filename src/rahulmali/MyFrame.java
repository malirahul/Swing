package rahulmali;


import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String... args) {
	// write your code here
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(700,500);
        //frame.setLocation(500,100);
        frame.setBounds(100,100,1000,500);
        frame.setTitle("My Frame");

        ImageIcon icon=new ImageIcon("rahul2.jfif");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        //Color color =new Color(255,0,0);
        c.setBackground((Color.RED));

        frame.setResizable(false);
    }
}
