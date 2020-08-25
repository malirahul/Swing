package rahulmali;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class listen extends JFrame implements ActionListener {

    Container c;
    JButton btn;
    JTextField t1;

    public listen(){
        setTitle("Action Event");
        setBounds(100,100,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c=this.getContentPane();
        c.setLayout(null);
        t1=new JTextField();
        t1.setBounds(100,100,100,30);
        c.add(t1);
        /*
        btn =new JButton("Click Me");
        btn.setBounds(100,100,100,30);
        c.add(btn);
        btn.addActionListener(this);
*/
        t1.setFont(new Font("arial",Font.BOLD,15));
        t1.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str= t1.getText();
        //btn.setText(str.toUpperCase());
        t1.setText(str.toUpperCase());

    }
}
public class AEListener {

    public static void main(String[] args) {
       new listen();


    }
}
