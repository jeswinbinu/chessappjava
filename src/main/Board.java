package main;

import java.awt.*;

public class Board {
    public static final int MAX_ROW = 8;
    public static final int MAX_COL = 8;
    public static final int SQUARE_SIZE = 75;
    public static final int HALF_SQUARE_SIZE = 75 / 2;

    public void draw(Graphics2D g2) {

        int colorChanger = 0; // 0 -> light color , 1-> dark color

        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                if (colorChanger == 0) {
                    g2.setColor(new Color(205, 199, 240));
                    colorChanger = 1;
                } else {
                    g2.setColor(new Color(100, 74, 247));
                    colorChanger = 0;
                }
                g2.fillRect(j * SQUARE_SIZE, i * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }
            if (colorChanger == 0) {
                colorChanger = 1;
            } else {
                colorChanger = 0;
            }
        }
    }
}
