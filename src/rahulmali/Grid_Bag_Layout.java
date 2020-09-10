package rahulmali;

import javax.swing.*;
import java.awt.*;

public class Grid_Bag_Layout extends JFrame {
    JButton b1=new JButton("Button 1");
    JButton b2=new JButton("Button 2");
    JButton b3=new JButton("Button 3");
    JButton b4=new JButton("Button 4");
    JButton b5=new JButton("Button 5");

    public Grid_Bag_Layout(){
        setTitle("Grid Bag Layout");
        setBounds(300, 200, 500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        GridBagLayout g=new GridBagLayout();
        c.setLayout(g);

        GridBagConstraints G=new GridBagConstraints();

        G.fill=GridBagConstraints.HORIZONTAL;
        G.weightx=0.5;//request for extra space horizontally
        G.gridx=0;
        G.gridy=0;
        c.add(b1,G);

        //G.weightx=0;//reset
        G.gridx=1;
        G.gridy=0;
        c.add(b2,G);

        G.gridx=2;
        G.gridy=0;
        c.add(b3,G);

        G.gridwidth=3;
        G.gridx=0;
        G.gridy=1;
        G.ipady=40;
        c.add(b4,G);

        G.gridwidth=2;
        G.ipady=0;
        G.gridx=1;
        G.gridy=2;
        G.anchor=GridBagConstraints.PAGE_END;
        G.weighty=1;
        c.add(b5,G);

        pack();
    }

    public static void main(String[] args) {
        new Grid_Bag_Layout();
    }
}
