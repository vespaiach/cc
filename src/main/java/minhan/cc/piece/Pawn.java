package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;

public class Pawn extends AbstractPiece {
    private boolean promoted;

    public Pawn(Side side) {
        super(side);
        this.promoted = false;
    }

    public void promote() {
        this.promoted = true;
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean test(Move move) {
        byte deltaX = (byte) Math.abs(move.end.x - move.start.x);
        byte deltaY = (byte) Math.abs(move.end.y - move.start.y);

        if (this.getSide().isRed()) {
            if (this.promoted) {
                return move.start.y <= 4 && move.end.y <= 4 && move.end.y <= move.start.y && deltaX <= 1 && deltaY <= 1 && deltaX != deltaY;
            } else {
                return move.start.y >= 5 && move.end.y >= 5 && move.end.y < move.start.y && deltaX == 0 && deltaY == 1;
            }
        } else {
            if (this.promoted) {
                return move.start.y >= 5 && move.end.y >= 5 && move.end.y >= move.start.y && deltaX <= 1 && deltaY <= 1 && deltaX != deltaY;
            } else {
                return move.start.y <= 4 && move.end.y <= 4 && move.end.y > move.start.y && deltaX == 0 && deltaY == 1;
            }
        }
    }
}
