package piece;

import main.GamePanel;

public class King extends Piece {
    public King(int color, int col, int row) {
        super(color, col, row);
        if (color == GamePanel.WHITE) {
            image = getImage("/res/piece/KingWhite");
        } else {
            image = getImage("/res/piece/KingBlack");
        }
    }
}
