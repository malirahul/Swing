package rahulmali;

import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {

        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);
        /*JLabel label=new JLabel("Username");
        label.setBounds(100,50,200,30);
        //label.setText("Password");
        Font font=new Font("Rahul",Font.ITALIC,30);
        label.setFont(font);
        c.add(label);
    */
        ImageIcon icon=new ImageIcon("rahul2.jfif");
        /*JLabel label=new JLabel(icon);
        label.setBounds(100,50,icon.getIconWidth(),icon.getIconHeight());
        c.add(label);
*/
        JLabel label1=new JLabel("Text",icon,JLabel.LEFT);
        label1.setBounds(0,100,500,200);
        c.add(label1);

        frame.setVisible(true);
    }
}