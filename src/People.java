public class People {

    enum Sex {
        MALE,
        FEMALE
    }

    private String first_name, last_name, middle_name, phone_number;
    private int passport_serial, passport_number, age;
    private Sex sex;

    public People(int passport_serial, int passport_number, String first_name, String last_name, String middle_name,
                  int age, Sex sex, String phone_number) {
        this.passport_serial = passport_serial;
        this.passport_number = passport_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.age = age;
        this.sex = sex;
        this.phone_number = phone_number;
    }

    public int getPassport_serial() {
        return passport_serial;
    }

    public void setPassport_serial(int passport_serial) {
        this.passport_serial = passport_serial;
    }

    public int getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(int passport_number) {
        this.passport_number = passport_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
