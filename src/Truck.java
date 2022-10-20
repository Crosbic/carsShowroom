public class Truck extends Showroom {

    TruckVariety variety;

    public float maxWeight;

    public Truck(int vin, CarType type, String brand, String model, TruckVariety variety) {
        super(vin, type, brand, model);
        this.variety = variety;
    }

    public TruckVariety getVariety() {
        return variety;
    }

    public void setVariety(TruckVariety variety) {
        this.variety = variety;
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
}
