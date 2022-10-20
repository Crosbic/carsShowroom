import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        DBSingleton dataBase = DBSingleton.getInstance();
        Connection connection = dataBase.getConnection();
        System.out.println("Opened database successfully");

        Staff staff = new Staff("1","Иван", "Мидин",
                "Олегович", 20, People.Sex.MALE, "+79004003455", Staff.Position.INTERN);
        StaffDAO staffDAO = new StaffDAO();
        staffDAO.insertStaff(staff, connection);
        staffDAO.deleteStaff(staff.getPassport(), connection);
        staff.setAge(30);
        staffDAO.updateStaff(staff, connection);
        ArrayList<Staff> staff_list = staffDAO.getStaff(connection);
        System.out.println(staff_list.size());
        connection.close();
    }
}