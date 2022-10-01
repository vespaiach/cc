package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;

public class Guard extends AbstractPiece {
    public static byte[][] bits = {
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0},
    };

    public Guard(Side side) {
        super(side);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean test(Move move) {
        if ((Math.abs(move.end.x - move.start.x) != 1) || (Math.abs(move.end.y - move.start.y) != 1)) {
            return false;
        }


        if (this.getSide().isRed()) {
            return Guard.bits[move.end.x][move.end.y] == 1 && move.end.y > 4 && move.start.y > 4;
        } else {
            return Guard.bits[move.end.x][move.end.y] == 1 && move.end.y < 5 && move.start.y < 5;
        }
    }
}


