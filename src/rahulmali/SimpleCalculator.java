package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {

    public Container c;
    public JLabel label1,label2,result;
    public JTextField t1,t2;
    public JButton add,sub,mul,div;

    Frame() {
        setTitle("Simple Calculator");
        setSize(450, 350);
        setLocation(150,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);

        label1=new JLabel("First Number: ");
        label1.setBounds(10,20,100,20);
        c.add(label1);
        t1=new JTextField();
        t1.setBounds(120,20,100,20);
        c.add(t1);

        label2=new JLabel("Second Number: ");
        label2.setBounds(10,50,100,20);
        c.add(label2);
        t2=new JTextField();
        t2.setBounds(120,50,100,20);
        c.add(t2);

        add=new JButton("+");
        add.setBounds(10,100,50,30);
        c.add(add);

        sub=new JButton("-");
        sub.setBounds(70,100,50,30);
        c.add(sub);

        mul=new JButton("*");
        mul.setBounds(130,100,50,30);
        c.add(mul);

        div=new JButton("/");
        div.setBounds(190,100,50,30);
        c.add(div);


        result=new JLabel("Result:");
        result.setBounds(10,150,150,20);
        c.add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);



        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            float a=Integer.parseInt(t1.getText());
            float b=Integer.parseInt(t2.getText());
        if(e.getSource()==add){
            float c=a+b;
            result.setText("Result : "+c);
        }
        else if(e.getSource()==sub){
            float c=a-b;
            result.setText("Result : "+c);
        }
        else if(e.getSource()==mul){
            float c=a*b;
            result.setText("Result : "+c);
        }
        else {
            float c=a/b;
            result.setText("Result : "+c);
        }
    }catch(NumberFormatException e1){
            result.setText("Please input integer only");
        }catch (ArithmeticException e2){
            result.setText("Can not divide by Zero");
        }
    }

}
public class SimpleCalculator{

    public static void main(String[] args) {
        new Frame();
    }
}
