package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;

public class Knight extends AbstractPiece {
    public Knight(Side side) {
        super(side);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean test(Move move) {
        return (move.end.x != move.start.x) && (move.start.x != move.end.x) && (Math.abs(move.end.y - move.start.y) + Math.abs(move.end.x - move.start.x) == 3);
    }
}
