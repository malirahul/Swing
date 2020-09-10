package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JOptionpaneConfirmDialog {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Message Dialog");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        frame.setLayout(new FlowLayout());
        JButton button1=new JButton("Click Me");
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sel=JOptionPane.showConfirmDialog(frame,"Do you want to exit","Confirm",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION){
                    System.out.println("Yes option is selected");

                    System.exit(0);
                }
                else if(sel==JOptionPane.NO_OPTION){
                    System.out.println("NO option is selected");
                }
                else{
                    System.out.println("Cancel option is selected");
                }
            }
        });

    }
}
