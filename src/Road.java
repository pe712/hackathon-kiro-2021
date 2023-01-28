public class Road {
    RoadType roadType;

    public Road(RoadType roadType) {
        this.roadType = roadType;
    }

    public enum RoadType {
        primary,
        secondary
    }

}
