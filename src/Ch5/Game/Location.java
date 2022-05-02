package Ch5.Game;

public class Location {
    public final int x;
    public final int y;

    public Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Location shift(final int shiftX, final int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = y + shiftY;
        return new Location(nextX, nextY);
    }
}
