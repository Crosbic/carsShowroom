import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public void deleteStaff(String staffPassport, Connection connection)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from staff where passport = ?;");
        preparedStatement.setString(1, staffPassport);
        int result = preparedStatement.executeUpdate();
        System.out.println("Number of records affected :: " + result);
    }
}
