package minhan.cc;

public class King extends AbstractPiece {
    public King(int id) {
        super(id);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean validateMove(int fromX, int fromY, int toX, int toY) {
        if (!this.inBoundary(fromX, fromY, toX, toY)) {
            return false;
        }

        if (this.getSide() == Side.Red) {
            return fromY <= 2 && toY <= 2;
        } else {
            return fromY >= 7 && toY >= 7;
        }
    }
}
