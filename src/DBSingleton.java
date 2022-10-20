import io.github.cdimascio.dotenv.Dotenv;
import java.sql.*;

public final class DBSingleton {
    public static DBSingleton INSTANCE;

    public static DBSingleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new DBSingleton();
        }
        return INSTANCE;

    }

    public Connection getConnection () throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Dotenv dotenv;
        dotenv = Dotenv.configure().load();
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/car_showroom",
                dotenv.get("USER"),
                dotenv.get("PASSWORD"));
    }
}
