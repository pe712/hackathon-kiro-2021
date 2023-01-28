import java.util.HashMap;

public abstract class Site implements Costly {
    int id;
    Coordinate coord;
    float[] distanceToOtherSites;
    HashMap<Client, Road> clients;
    HashMap<DistributionCenter, Road> distributionCenters;
}
