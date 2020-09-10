package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class B extends JFrame implements ItemListener {

    //2.JComboBox combo;
   // 1.JRadioButton male,female;
    JTextArea ta;
    //3.JCheckBox c1,c2,c3,c4;
    //4.//
    JMenuBar menubar;
    JMenu mymenu;
    JCheckBoxMenuItem c1;
    public B(){

        Container c=getContentPane();
        c.setLayout(null);

        menubar=new JMenuBar();
        mymenu=new JMenu("file");

        c1=new JCheckBoxMenuItem("Print");
        mymenu.add(c1);
        menubar.add(mymenu);
        this.setJMenuBar(menubar);
        c1.addItemListener(this);

/*
        c1=new JCheckBox("10th");
        c2=new JCheckBox("12th");
        c3=new JCheckBox("Graduation");
        c4=new JCheckBox("Post-Graduation");
        c1.setBounds(50,50,100,30);
        c2.setBounds(50,100,100,30);
        c3.setBounds(50,150,100,30);
        c4.setBounds(50,200,100,30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
*/
        /*male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(50,50,100,20);
        female.setBounds(50,100,100,20);
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);

        c.add(male);
        c.add(female);

        male.addItemListener(this);
        female.addItemListener(this);
/*
        String[] value={"None","A","B","C","D","E"};
        combo=new JComboBox(value);
        combo.setBounds(50,50,100,30);
        c.add(combo);
        combo.addItemListener(this);
*/

        ta=new JTextArea();
        ta.setBounds(200,50,100,100);
        c.add(ta);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
/*
        String str= combo.getSelectedItem().toString();
        ta.setText(str);
*/
      /*  if (e.getSource()==male){
            ta.setText("Male is clicked");
        }
        if (e.getSource()==female){
            ta.setText("FeMale is clicked");
        }
*/
       /* if (c1.isSelected()){
            ta.setText("10th");
        }
        if (c2.isSelected()){
            ta.setText(ta.getText()+"\n"+"12th");
        }
        if (c3.isSelected()){
            ta.setText(ta.getText()+"\n"+"Graduation");
        }
        if (c4.isSelected()){
            ta.setText(ta.getText()+"\n"+"Post-Graduation");
        }
        */

        if (c1.isSelected()){
            ta.setText("Print is On");
        }
        else {
            ta.setText("Print is Off");
        }


    }
}

public class AEitemListener {

    public static void main(String[] args) {
        B f=new B();
        f.setTitle("Item Event");
        f.setBounds(100,100,400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
