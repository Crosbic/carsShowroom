import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StaffDAO {

    public void insertStaff(Staff staff, Connection connection) throws SQLException {
        String values = String.format("values (%d, %d, '%s', '%s', '%s', %d, '%s', '%s', '%s')",
                staff.getPassport_serial(), staff.getPassport_number(),staff.getFirst_name(), staff.getLast_name(),
                staff.getMiddle_name(), staff.getAge(), staff.getSex(), staff.getPhone_number(), staff.getPosition());
        String query = "insert into staff (passport_serial, passport_number, first_name, last_name, middle_name, age," +
                "sex, phone_number, position)\n" + values;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.executeUpdate();
    }
}
