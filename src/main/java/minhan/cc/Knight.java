package minhan.cc;

public class Knight extends AbstractPiece {
    public Knight(int id) {
        super(id);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean validateMove(int fromX, int fromY, int toX, int toY) {
        if (!this.inBoundary(fromX, fromY, toX, toY) || (fromX == toX) || (fromY == toY)) {
            return false;
        }

        return Math.abs(toY - fromY) + Math.abs(toX - fromX) == 3;
    }
}
