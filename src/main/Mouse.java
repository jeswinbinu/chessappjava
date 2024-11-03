package main;

import java.awt.event.*;

public class Mouse extends MouseAdapter {

    public int x, y;
    public boolean pressed;

    public void mousePressed(MouseEvent e) {
        pressed = true;
    }

    public void mouseReleased(MouseEvent e) {
        pressed = false;
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}
