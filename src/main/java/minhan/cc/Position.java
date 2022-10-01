package minhan.cc;

import minhan.cc.piece.AbstractPiece;

public class Position {
    private AbstractPiece occupier;

    private Coord coord;

    public Position(Coord coord) {
        this.coord = coord;
    }

    public Position(Coord coord, AbstractPiece piece) {
        this.coord = coord;
        this.occupier = piece;
    }

    public AbstractPiece takePosition(AbstractPiece piece) {
        this.occupier = piece;
        return this.occupier;
    }

    public AbstractPiece getPiece() {
        return this.occupier;
    }

    public Coord getCoord() {
        return this.coord;
    }
}
