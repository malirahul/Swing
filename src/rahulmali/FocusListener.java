package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;


class Focus extends JFrame implements java.awt.event.FocusListener {
    JTextField t1;
    JTextArea ta;

            public Focus() {

           Container c = getContentPane();
            c.setLayout(null);

            t1 = new JTextField("My Label");
            t1.setBounds(50, 100, 100, 30);
            c.add(t1);
            t1.addFocusListener(this);

            ta = new JTextArea();
            ta.setBounds(200, 50, 300, 300);
            c.add(ta);

        }

    @Override
    public void focusGained(FocusEvent e) {
                ta.setText(ta.getText()+"\n"+"Focus Gained");
    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"Focus Lost");
            }

}

class FocusListener {
    public static void main(String[] args) {
        Focus f=new Focus();
        f.setTitle("Focus Events");
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
