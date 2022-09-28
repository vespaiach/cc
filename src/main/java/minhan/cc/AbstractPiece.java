package minhan.cc;

public abstract class AbstractPiece {
    public int id;
    private State state;
    private Side side;

    public boolean isAlive() {
        return this.state == State.Alive;
    }

    public void kill() {
        this.state = State.Dead;
    }

    public Side getSide() {
        return this.side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public abstract void draw();
    public abstract boolean validateMove();
}
