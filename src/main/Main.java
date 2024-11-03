package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Chess.in");

        // logic to put the panel in the window
        GamePanel gamepanel = new GamePanel();
        window.add(gamepanel);
        window.pack();

        // logic for adjusting the functions of the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamepanel.startGame();
    }
}
