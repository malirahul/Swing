package rahulmali;

import javax.swing.*;
import java.awt.*;

public class MyButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);



        ImageIcon icon=new ImageIcon("rahul1.jfif");
        JButton btn=new JButton(icon);
        btn.setSize(icon.getIconHeight(),icon.getIconHeight());
        btn.setLocation(100,100);
        c.add(btn);

       /* Font font=new Font("Ariel",Font.BOLD,20);
        btn.setFont(font);

        btn.setText("MyButton");
        btn.setForeground(Color.RED);
        btn.setBackground(Color.BLACK);
  */
       /* Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);
*/
       // btn.setEnabled(false);
        btn.setVisible(true);

        frame.setVisible(true);
    }
}
