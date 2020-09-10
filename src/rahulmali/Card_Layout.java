package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Card_Layout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        Container c=frame.getContentPane();

        CardLayout cardLayout=new CardLayout();
        c.setLayout(cardLayout);

        JButton b1=new JButton("Page 1");
        JButton b2=new JButton("Page 2");
        JButton b3=new JButton("Page 3");
        JButton b4=new JButton("Page 4");


        c.add(b1,"Page1");
        c.add(b2,"Page2");
        c.add(b3,"Page3");
        c.add(b4,"Page4");

        cardLayout.next(c);
        cardLayout.previous(c);
        cardLayout.first(c);
        cardLayout.last(c);

        cardLayout.show(c,"Page3");



    }
}
