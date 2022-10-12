public class Staff extends People {

    enum Position {
        DIRECTOR,
        MANAGER,
        INTERN
    }

    Position position;

    public Staff(String passport, String first_name, String last_name, String middle_name,
                 int age, Sex sex, String phone_number, Position position) {
        super(passport, first_name, last_name, middle_name, age, sex, phone_number);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
