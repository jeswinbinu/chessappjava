package piece;

import main.GamePanel;
import main.Type;

public class Queen extends Piece {
    public Queen(int color, int col, int row) {
        super(color, col, row);
        type = Type.QUEEN;
        if (color == GamePanel.WHITE) {
            image = getImage("/res/piece/QueenWhite");
        } else {
            image = getImage("/res/piece/QueenBlack");
        }
    }

    public boolean canMove(int targetCol, int targetRow) {
        if (isWithinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false) {
            //veritcal and hori movement
            if (targetCol == preCol || targetRow == preRow) {
                if (isValidSquare(targetCol, targetRow) && pieceIsOnStraightLine(targetCol, targetRow) == false) {
                    return true;
                }
            }
            //diagonal
            if (Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
                if (isValidSquare(targetCol, targetRow) && pieceIsOnDiagonalLine(targetCol, targetRow) == false) {
                    return true;
                }
            }
        }
        return false;
    }
}
