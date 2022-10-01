package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;
import minhan.cc.piece.AbstractPiece;

public class King extends AbstractPiece {
    public King(Side side) {
        super(side);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean test(Move move) {
        byte deltaX = (byte) Math.abs(move.end.x - move.start.x);
        byte deltaY = (byte) Math.abs(move.end.y - move.start.y);

        if (deltaX > 1 || deltaY > 1) {
            return false;
        }

        byte[][] bits = {
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0},
        };


        if (this.getSide().isRed()) {
            if (deltaX == deltaY && deltaX == 1) {
                return move.end.y >= 7 && move.start.y >= 7 && Guard.bits[move.end.x][move.start.x] == 1;
            } else {
                return move.end.y >= 7 && move.start.y >= 7 && bits[move.end.x][move.start.x] == 1;
            }
        } else {
            if (deltaX == deltaY && deltaX == 1) {
                return move.end.y <= 2 && move.start.y <= 2 && Guard.bits[move.end.x][move.start.x] == 1;
            } else {
                return move.end.y <= 2 && move.start.y <= 2 && bits[move.end.x][move.start.x] == 1;
            }
        }
    }
}
