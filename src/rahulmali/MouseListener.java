package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mouse extends JFrame implements java.awt.event.MouseListener {
    JLabel label;
    JTextArea ta;

    public mouse(){

        Container c=getContentPane();
        c.setLayout(null);

        label=new JLabel("My Label");
        label.setFont(new Font("Arial",Font.BOLD,16));
        label.setBounds(50,100,100,30);
        c.add(label);
        label.addMouseListener(this);

        ta=new JTextArea();
        ta.setBounds(200,50,300,300);
        c.add(ta);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Relesed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Exited");
    }
}

public class MouseListener {
    public static void main(String[] args) {
        mouse m=new mouse();
        m.setTitle("Mouse Events");
        m.setVisible(true);
        m.setBounds(100,100,700,500);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
