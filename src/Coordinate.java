public class Coordinate {
    int i;
    int j;

    public Coordinate(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public double distance(Coordinate otherCoord) {
        double dx = i - otherCoord.i;
        double dy = j - otherCoord.j;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
