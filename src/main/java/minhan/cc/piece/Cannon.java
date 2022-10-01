package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;

public class Cannon extends AbstractPiece {
    public Cannon(Side side) {
        super(side);
    }

    @Override
    public void draw() {
    }

    @Override
    public boolean test(Move move) {
        if (move.end.y == move.start.y) {
            return Math.abs(move.end.x - move.start.x) > 0;
        } else if (move.end.x == move.start.x) {
            return Math.abs(move.end.y - move.start.y) > 0;
        } else {
            return false;
        }
    }
}
