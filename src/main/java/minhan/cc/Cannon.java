package minhan.cc;

public class Cannon extends AbstractPiece {
    public Cannon(int id) {
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

        if (((toX - fromX) != 0) && ((toY - fromY) != 0)) {
            return false;
        }
        return true;
    }
}
