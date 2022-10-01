package minhan.cc;

public enum Side {
    Red , Black;


    public boolean isRed() {
        return this.equals(Side.Red);
    }

    public boolean isBlack() {
        return this.equals(Side.Black);
    }
}
