package minhan.cc;

import minhan.cc.piece.*;

public class Board {
    Position[][] positions;

    public Board() {
        positions = new Position[9][10];
        for (byte x = 0; x < 9; x++) {
            for (byte y = 0; y < 10; y++) {
                positions[x][y] = new Position(new Coord(x, y));
            }
        }
    }

    private void deployTroop(Side side) {
        byte lineOne = (byte) (side.isBlack() ? 0 : 9);
        byte lineTwo = (byte) (side.isBlack() ? 2 : 7);
        byte lineThree = (byte) (side.isBlack() ? 3 : 6);

        positions[0][lineOne].takePosition(new Rook(side));
        positions[1][lineOne].takePosition(new Knight(side));
        positions[2][lineOne].takePosition(new Bishop(side));
        positions[3][lineOne].takePosition(new Guard(side));
        positions[4][lineOne].takePosition(new King(side));
        positions[5][lineOne].takePosition(new Guard(side));
        positions[6][lineOne].takePosition(new Bishop(side));
        positions[7][lineOne].takePosition(new Knight(side));
        positions[8][lineOne].takePosition(new Rook(side));

        positions[1][lineTwo].takePosition(new Cannon(side));
        positions[7][lineTwo].takePosition(new Cannon(side));

        positions[0][lineThree].takePosition(new Pawn(side));
        positions[2][lineThree].takePosition(new Pawn(side));
        positions[4][lineThree].takePosition(new Pawn(side));
        positions[6][lineThree].takePosition(new Pawn(side));
        positions[8][lineThree].takePosition(new Pawn(side));
    }

    public void initGame() {
        this.deployTroop(Side.Black);
        this.deployTroop(Side.Red);
    }

    public void draw() {

    }

}
