import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Dotenv dotenv = null;
        dotenv = Dotenv.configure().load();
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/car_showroom",
                dotenv.get("USER"),
                dotenv.get("PASSWORD"));
        System.out.println("Opened database successfully");
        Staff staff = new Staff(2313, 553334, "Иван", "Мидин",
                "Олегович", 20, People.Sex.MALE, "+79004003455", Staff.Position.INTERN);
        StaffDAO staffDAO = new StaffDAO();
        staffDAO.insertStaff(staff, connection);
        connection.close();
    }
}