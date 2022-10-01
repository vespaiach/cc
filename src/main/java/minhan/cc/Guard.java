package minhan.cc;

public class Guard extends AbstractPiece {
    public Guard(int id) {
        super(id);
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean validateMove(int fromX, int fromY, int toX, int toY) {
        if (Math.abs(fromY - toY) != 1 || Math.abs(fromX - toX) != 1) {
            return false;
        }

        String pattern = "ffftftffffffftffffffftftffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";

        return pattern.charAt(fromX + fromY * 9) == 't' && pattern.charAt(toX + toY * 9) == 't';
    }
}


