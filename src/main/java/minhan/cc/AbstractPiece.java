package minhan.cc;

public abstract class AbstractPiece {
    public int id;
    private State state;

    public AbstractPiece(int id) {
        this.id = id;
        this.state = State.Alive;
    }

    public boolean isAlive() {
        return this.state == State.Alive;
    }

    public void kill() {
        this.state = State.Dead;
    }

    public Side getSide() {
        return this.id > Side.Black.ordinal() ? Side.Black : Side.Red;
    }

    public boolean inBoundary(int fromX, int fromY, int toX, int toY) {
        return fromX <= 8 && fromX >= 0 && toX <= 8 && toX >= 0 && fromY >= 0 && fromY <= 9 && toY >= 0 && toY <= 9;
    }

    public abstract void draw();

    public abstract boolean validateMove(int fromX, int fromY, int toX, int toY);
}
