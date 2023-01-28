public class DistributionCenter extends Site {
    int buildingCost;
    int maxStock;

    public DistributionCenter(int buildingCost, int maxStock) {
        this.buildingCost = buildingCost;
        this.maxStock = maxStock;
    }

    public int cost() {
        return buildingCost;
    }
}
