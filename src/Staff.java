public class Staff extends People {

    enum Position {
        DIRECTOR,
        MANAGER,
        INTERN
    }

    Position position;

    public Staff(int pass_serial,int pass_number, String first_name, String last_name, String middle_name,
                 int age, Sex sex, String phone_number, Position position) {
        super(pass_serial, pass_number, first_name, last_name, middle_name, age, sex, phone_number);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
