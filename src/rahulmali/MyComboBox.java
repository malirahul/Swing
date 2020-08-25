package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyComboBox");
        frame.setSize(700,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values={"A","B","C","D","C","C"};

        JComboBox c1=new JComboBox(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);
        //c1.setEditable(true);
        //c1.setSelectedItem("B");
        //c1.setSelectedIndex(3);
        //c1.setFont(new Font("Ariel",Font.BOLD,20));

        JButton btn=new JButton("OK");
        btn.setBounds(300,100,100,30);
        c.add(btn);

        JLabel label=new JLabel();
        label.setBounds(100,300,100,30);
        c.add(label);

        c1.addItem("E");
        c1.removeItem("C");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item= String.valueOf(c1.getSelectedIndex());
                label.setText(item);

            }
        });



        frame.setVisible(true);
    }
}
