public class Car {

    enum CarType {
        CAR,
        TRUCK
    }

    int _id;
    CarType type;
    String brand, model, firstName, lastName;

    public Car(int _id, CarType type, String brand, String model, String firstName, String lastName) {
        this._id = _id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
