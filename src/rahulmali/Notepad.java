package rahulmali;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Notepad extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu file,edit,format,view,help,zoom;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22;
    JTextArea ta;

    Notepad() {
        Container c=getContentPane();
        c.setLayout(null);

        menubar =new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("Edit");
        format=new JMenu("Format");
        view=new JMenu("View");
        help=new JMenu("Help");


        i1=new JMenuItem("New");
        i2=new JMenuItem("Open...");
        i3=new JMenuItem("Save..");
        i4=new JMenuItem("Save As");
        i5=new JMenuItem("Print...");
        i6=new JMenuItem("Exit");

        i7=new JMenuItem("Undo");
        i8=new JMenuItem("Cut");
        i9=new JMenuItem("Copy");
        i10=new JMenuItem("Paste");
        i11=new JMenuItem("Delete");
        i12=new JMenuItem("Select All");

        i13=new JMenuItem("Word Wrap");
        i14=new JMenuItem("Font");

        zoom =new JMenu("Zoom");
        i16=new JMenuItem("Zoom in");
        i17=new JMenuItem("Zoom Out");
        i18=new JMenuItem("Restore Default Zoom");
        i19=new JMenuItem("Status Bar");

        i20=new JMenuItem("View Help");
        i21=new JMenuItem("Send Feedback");
        i22=new JMenuItem("About Notepad");




        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        i9.addActionListener(this);
        i10.addActionListener(this);
        i11.addActionListener(this);
        i12.addActionListener(this);
        i13.addActionListener(this);
        i14.addActionListener(this);
        zoom.addActionListener(this);
        i16.addActionListener(this);
        i17.addActionListener(this);
        i18.addActionListener(this);
        i19.addActionListener(this);
        i20.addActionListener(this);
        i21.addActionListener(this);
        i22.addActionListener(this);

        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        file.add(i6);

        edit.add(i7);
        edit.add(i8);
        edit.add(i9);
        edit.add(i10);
        edit.add(i11);
        edit.add(i12);

        format.add(i13);
        format.add(i14);

        view.add(zoom);
        zoom.add(i16);
        zoom.add(i17);
        zoom.add(i18);
        view.add(i19);

        help.add(i20);
        help.add(i21);
        help.add(i22);

        menubar.add(file);
        menubar.add(edit);
        menubar.add(format);
        menubar.add(view);
        menubar.add(help);

        this.setJMenuBar(menubar);

        ta=new JTextArea();
        ta.setBounds(10,10,1500,1000);
        c.add(ta);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==i1) {
            ta.setText("New File...");
        }
        if (e.getSource()==i2) {
            ta.setText("Open File...");
        }
        if (e.getSource()==i3) {
            ta.setText("Save File...");
        }
        if (e.getSource()==i4) {
            ta.setText("Save As");
        }
        if (e.getSource()==i5) {
            ta.setText("Print");
        }
        if (e.getSource()==i6) {
            ta.setText("Exit");
        }

        if (e.getSource()==i7) {
            ta.setText("Undo");
        }
        if (e.getSource()==i8) {
            ta.cut();
        }
        if (e.getSource()==i9) {
            ta.copy();
        }
        if (e.getSource()==i10) {
            ta.paste();
        }
        if (e.getSource()==i11) {
            ta.setText("Delete");
        }
        if (e.getSource()==i12) {
            ta.setText("Select All");
        }

        if (e.getSource()==i13) {
            ta.setText("Word Wrap");
        }
        if (e.getSource()==i14) {
            ta.setText("Paste");
        }

        if (e.getSource()==zoom) {
            ta.setText("Zoom");
        }
        if (e.getSource()==i16) {
            ta.setText("Zoom in");
        }
        if (e.getSource()==i17) {
            ta.setText("Zoom Out");
        }
        if (e.getSource()==i18) {
            ta.setText("Restore Default Zoom");
        }
        if (e.getSource()==i19) {
            ta.setText("Status Bar");
        }

        if (e.getSource()==i20) {
            ta.setText("View Help");
        }
        if (e.getSource()==i21) {
            ta.setText("Send Feedback");
        }
        if (e.getSource()==i22) {
            ta.setText("About Notepad");
        }
    }

    public static void main(String[] args) {
        Notepad f=new Notepad();
        f.setTitle("MenuBar Example");
        f.setBounds(100,50,900,700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

