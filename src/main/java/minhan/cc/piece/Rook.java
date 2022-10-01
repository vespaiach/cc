package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;

public class Rook extends AbstractPiece {
    public Rook(Side side) {
        super(side);
    }

    @Override
    public void draw() {
    }

    @Override
    public boolean test(Move move) {
        byte deltaX = (byte) Math.abs(move.end.x - move.start.x);
        byte deltaY = (byte) Math.abs(move.end.y - move.start.y);

        return deltaX != deltaY;
    }
}
