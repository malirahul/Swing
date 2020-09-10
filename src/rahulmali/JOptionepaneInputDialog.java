package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionepaneInputDialog {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        frame.setLayout(new FlowLayout());

        JButton button=new JButton("Click Me");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JOptionPane.showInputDialog("Enter Your Name : ");
                if(s.length()>0){
                    System.out.println("The name of user is : "+s);
                }
            }
        });


    }
}
