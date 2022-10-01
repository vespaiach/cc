package minhan.cc;

public class Pawn extends AbstractPiece {
    public Pawn(int id) {
        super(id);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean validateMove(int fromX, int fromY, int toX, int toY) {
        if (!this.inBoundary(fromX, fromY, toX, toY) || (fromX != toX)) {
            return false;
        }

        if (this.getSide() == Side.Red) {
            return toY - fromY == 1;
        } else {
            return toY - fromY == -1;
        }
    }
}
