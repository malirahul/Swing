package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionepaneMessageDialog {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Message Dialog");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        frame.setLayout(new FlowLayout());

        JButton button1=new JButton("Plain");
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Hello This is a Plain message","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });

        JButton button2=new JButton("Information");
        frame.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Hello This is a Information message","Message",JOptionPane.INFORMATION_MESSAGE);

            }
        });

        JButton button3=new JButton("Question");
        frame.add(button3);

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Hello This is a Question message","Message",JOptionPane.QUESTION_MESSAGE);

            }
        });

        JButton button4=new JButton("Error");
        frame.add(button4);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Hello This is a Error message","Message",JOptionPane.ERROR_MESSAGE);

            }
        });

        JButton button5=new JButton("Worning");
        frame.add(button5);

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"Hello This is a Plain message","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });

    }
}
