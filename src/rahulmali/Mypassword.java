package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Mypassword {

    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame();
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,50,120,30);
        c.add(pass);

        pass.setText("123456789");
        pass.setFont(new Font("Ariel",Font.PLAIN,30));

        pass.setEchoChar('*');
        //pass.setEchoChar((char)0);

        frame.setVisible(true);
    }
}
