package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest?serverTimezone=UTC", "root", "LoveKrowe12");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//            int rowCount =statement.executeUpdate("INSERT INTO users VALUE(8,'Bozydar', 'Bozydar Kostek', 1993)");  // prawidłowo dodaje

            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String displayName= resultSet.getString("display_name");
                Integer yearOfBirth= resultSet.getInt("year_of_birth");
                System.out.println(String.format("Id: %s Name: %s Display Name: %s Year Of Birth: %s", id, name, displayName, yearOfBirth));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
