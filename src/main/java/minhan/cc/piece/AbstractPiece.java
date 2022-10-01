package minhan.cc.piece;

import minhan.cc.Move;
import minhan.cc.Side;
import minhan.cc.State;

import java.util.function.Predicate;


public abstract class AbstractPiece implements Predicate<Move> {
    private State state;
    private Side side;

    public AbstractPiece(Side side) {
        this.side = side;
        this.state = State.Alive;
    }

    public boolean isAlive() {
        return this.state == State.Alive;
    }

    public void kill() {
        this.state = State.Dead;
    }

    public Side getSide() {
        return this.side;
    }

    public abstract void draw();
}
