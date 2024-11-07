package Hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {
            // Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "sakshi#31@2003");

            // Create the statement object for executing queries
            statement = connection.createStatement();

        } catch (Exception e) {
            System.out.println("Database connection error:");
            e.printStackTrace();
        }
    }
}