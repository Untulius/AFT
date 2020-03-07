package testsql.main;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/itc1?serverTimezone=UTC",
                    "root",
                    "smYtr03d"
            );
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery("select * from new_books where id = 1");
            showResult(result);

            stmt.executeUpdate("update new_books set price = 300 where id = 1");
            showResult(stmt.executeQuery("select * from new_books where id = 1"));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void showResult(ResultSet result) throws SQLException {
        while (result.next()) {
            System.out.println("Номер строки в выборке №" + result.getRow()
                    + "\nАвтор: " + result.getString(3)
                    + " Название: " + result.getString("title")
                    + "\nЦена " + result.getBigDecimal("price"));
        }
    }
}
