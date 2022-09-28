public class Customer {

    enum Sex {
        Male,
        Female
    }
    int _id;
    String firstName, lastName, middleName;
    int age;
    Sex type;
    String phoneNumber;

    public Customer(int _id, String firstName, String lastName, String middleName, int age, Sex type, String phoneNumber) {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.type = type;
        this.phoneNumber = phoneNumber;
    }
}
