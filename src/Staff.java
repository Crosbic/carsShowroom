public class Staff {

    enum Position {
        DIRECTOR,
        MANAGER,
        INTERN
    }

    int _id;
    Position type;
    String phoneNumber;

    public Staff(int _id, Position type, String phoneNumber) {
        this._id = _id;
        this.type = type;
        this.phoneNumber = phoneNumber;
    }

}
