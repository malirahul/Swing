package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

class R extends JFrame implements KeyListener {
    JTextArea ta;
    public R(){
        Container c=getContentPane();
        c.setLayout(null);
        ta=new JTextArea();
        ta.setBounds(10,10,370,330);
        c.add(ta);
        ta.addKeyListener(this);

    }

    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
     ta.setText(ta.getText()+"\n"+"Key is Pressed :"+e.getKeyChar());
    }

    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Released :"+e.getKeyChar());
    }

    @Override
    public void keyReleased(java.awt.event.KeyEvent e) {
        ta.setText(ta.getText()+"\n"+"Key is Typed :"+e.getKeyChar());
    }
}

public class KeyEvent {
    public static void main(String[] args) {

        R f=new R();
        f.setTitle("Key Event");
        f.setBounds(100,100,400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
