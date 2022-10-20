import java.sql.*;
import java.util.ArrayList;

public class StaffDAO {

    public void insertStaff(Staff staff, Connection connection) throws SQLException {
        String values = String.format("values ('%s', '%s', '%s', '%s', %d, '%s', '%s', '%s')",
                staff.getPassport(),staff.getFirst_name(), staff.getLast_name(),
                staff.getMiddle_name(), staff.getAge(), staff.getSex(), staff.getPhone_number(), staff.getPosition());
        String query = "insert into staff (passport, first_name, last_name, middle_name, age," +
                "sex, phone_number, position)\n" + values;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
    }

    public void deleteStaff(String staffPassport, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from staff where passport = ?;");
        preparedStatement.setString(1, staffPassport);
        int result = preparedStatement.executeUpdate();
        System.out.println("Number of records affected :: " + result);
    }

    public void updateStaff(Staff staff, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update staff set first_name = ?," +
                "last_name = ?, middle_name = ?, age = ?, sex = ?, phone_number = ?, position = ? where passport = ?;");
        preparedStatement.setString(1, staff.getFirst_name());
        preparedStatement.setString(2, staff.getLast_name());
        preparedStatement.setString(3, staff.getMiddle_name());
        preparedStatement.setInt(4, staff.getAge());
        preparedStatement.setString(5, staff.getSex().toString());
        preparedStatement.setString(6, staff.getPhone_number());
        preparedStatement.setString(7, staff.getPosition().toString());
        preparedStatement.setString(8, staff.getPassport());
        preparedStatement.executeUpdate();
    }

    public ArrayList<Staff> getStaff(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select * from staff;");
        ResultSet rs = preparedStatement.executeQuery();
        ArrayList<Staff> staffList = new ArrayList<>();

        while (rs.next()) {
                String passport = rs.getString("passport");
                String first_name = rs.getString("First_name");
                String last_name = rs.getString("last_name");
                String middle_name = rs.getString("middle_name");
                int age = rs.getInt("age");
                People.Sex sex = People.Sex.valueOf(rs.getString("sex"));
                String phone_number = rs.getString("phone_number");
                Staff.Position position = Staff.Position.valueOf(rs.getString("position"));
            Staff staff_list = new Staff(passport, first_name, last_name, middle_name, age, sex, phone_number, position);
            staffList.add(staff_list);
        }

        return staffList;
    }
}
