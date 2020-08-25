package rahulmali;

import javax.swing.*;

public class MyMenuBar {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Menu Bar");
        frame.setBounds(200,100,700,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu=new JMenuBar();

        JMenu file=new JMenu("File");
        JMenuItem i1=new JMenuItem("New");
        JMenuItem i2=new JMenuItem("Open");
        JMenuItem i3=new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);
        menu.add(file);
        frame.setJMenuBar(menu);

        JMenu edit=new JMenu("Edit");
        JMenuItem i4=new JMenuItem("Undo");
        JMenuItem i5=new JMenuItem("Redo");
        edit.add(i4);
        edit.add(i5);

        file.add(edit);


        frame.setVisible(true);
    }
}
