public class Contract {

    String passport;
    String first_name, last_name, middle_name;
    String driver_license;
    String brand, model;
    CarType type;
    int contract_number, price;

    public Contract(int contract_number, String passport, String first_name, String last_name, String middle_name, String driver_license,
                    String brand, String model, CarType type, int price) {
        this.contract_number = contract_number;
        this.passport = passport;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.driver_license = driver_license;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public int getContract_number() { return contract_number; }

    public void setContract_number(int contract_number) { this.contract_number = contract_number; }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
