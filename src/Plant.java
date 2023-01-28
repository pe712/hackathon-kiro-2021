public class Plant extends Site {
    int buildingCost;
    int maxStock;
    PlantType type;

    public Plant(int buildingCost, int maxStock, PlantType type){
        this.buildingCost = buildingCost;
        this.maxStock = maxStock;
        this.type = type;
    }

    public int cost() {
        return buildingCost;
    }

    public enum PlantType{
        standardPlant,
        automatedPlant
    }
}

