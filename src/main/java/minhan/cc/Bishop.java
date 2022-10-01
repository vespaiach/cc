package minhan.cc;

public class Bishop extends AbstractPiece {
    public Bishop(int id) {
        super(id);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean validateMove(int fromX, int fromY, int toX, int toY) {
        if (!this.inBoundary(fromX, fromY, toX, toY) || Math.abs(fromY - toY) != 2 || Math.abs(fromX - toX) != 2) {
            return false;
        }

        if (this.getSide() == Side.Red) {
            return fromY <= 4 && toY <= 4;
        } else {
            return fromY >= 5 && toY >= 5;
        }
    }
}
