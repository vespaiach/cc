package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;
import minhan.cc.piece.AbstractPiece;

public class Bishop extends AbstractPiece {
    public Bishop(Side side) {
        super(side);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean test(Move move) {
        if ((Math.abs(move.end.y - move.start.y) != 2) || (Math.abs(move.end.x - move.start.x) != 2)) {
            return false;
        }

        byte[][] bits = {
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 1, 0, 0},
        };

        if (this.getSide().isRed()) {
            return bits[move.end.x][move.end.y] == 1 && move.end.y > 4 && move.start.y > 4;
        } else {
            return bits[move.end.x][move.end.y] == 1 && move.end.y < 5 && move.start.y < 5;
        }
    }
}
