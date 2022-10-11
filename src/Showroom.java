public class Showroom {

     enum CarType {
          CAR,
          TRUCK
     }

     int vin;
     CarType type;
     String brand;
     String model;

     public Showroom(int vin, CarType type, String brand, String model) {
          this.vin = vin;
          this.type = type;
          this.brand = brand;
          this.model = model;
     }
}
