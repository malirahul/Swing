package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Motion extends JFrame implements java.awt.event.MouseMotionListener {
    JLabel label;
    JTextArea ta;

    public Motion() {

        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("My Label");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setBounds(50, 100, 100, 30);
        c.add(label);
        label.addMouseMotionListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 300, 300);
        c.add(ta);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse Moved");
    }
}

class MouseMotionListener {
    public static void main(String[] args) {
        Motion m=new Motion();
        m.setTitle("MouseMotion Events");
        m.setVisible(true);
        m.setBounds(100,100,700,500);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
