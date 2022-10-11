public class Truck extends Showroom {

    enum Variety {
        FLATBED,
        TRAWL,
        PLATFORM,
        AWNING,
        ALL_METAL,
        ISOTHERMAL,
        REFRIGERATOR,
        TANKS,
        SPECIAL
    }

    Variety variety;

    public float maxWeight;

    public Truck(int vin, CarType type, String brand, String model, Variety variety) {
        super(vin, type, brand, model);
        this.variety = variety;
    }
}
