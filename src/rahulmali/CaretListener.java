package rahulmali;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import java.awt.*;


class Caret extends JFrame implements javax.swing.event.CaretListener {
    JTextField t1;
    JTextArea ta;

    public Caret() {

        Container c = getContentPane();
        c.setLayout(null);

        t1 = new JTextField();
        t1.setBounds(50, 100, 100, 30);
        c.add(t1);
        t1.addCaretListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 300, 300);
        c.add(ta);

    }


    @Override
    public void caretUpdate(CaretEvent e) {
        ta.setText(ta.getText()+"\nCaret Updated : "+e.getDot()+":"+e.getMark());
    }
}


public class CaretListener {
    public static void main(String[] args) {
        Caret f=new Caret();
        f.setTitle("Focus Events");
        f.setVisible(true);
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
