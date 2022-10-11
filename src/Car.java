public class Car extends Showroom {

    enum Variant {
        SEDAN,
        HATCHBACK,
        STATION_WAGON
    }

    Variant variant;

    public Car(int vin, CarType type, String brand, String model, Variant variant) {
        super(vin, type, brand, model);
        this.variant = variant;
    }
}
