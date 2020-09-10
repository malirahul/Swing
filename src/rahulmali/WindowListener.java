package rahulmali;

import javax.swing.*;
import java.awt.event.*;

class Window extends JFrame implements java.awt.event.WindowListener {
    public Window(){
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deatactivated");
    }
}

public class WindowListener {
    public static void main(String[] args) {
        Window w= new Window();
        w.setTitle("Window Events");
        w.setVisible(true);
        w.setBounds(100,100,700,500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
