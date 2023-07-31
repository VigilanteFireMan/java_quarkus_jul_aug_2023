import java.sql.*;

public class JdbcExample1 {
    public static void main(String[] args) throws SQLException {
        //insertPerson("Sam", "Thomas", 12);
        printAllPersons();
    }

    private static void printAllPersons() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "select * from persons";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                int age = resultSet.getInt("age");
                System.out.println(id + ", " + firstName + ", " + lastName + ", " + age);
            }
            statement.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }

    }

    private static void insertPerson(String firstName, String lastName, int age) throws SQLException {
        //Load the Jdbc driver for mysql
        //Create a connection
        //Prepare the SQL statement
        //Execute the statement
        //Close the connection
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String sql = "insert into persons(first_name, last_name, age) values('%s','%s',%s)";
            Statement statement = connection.createStatement();
            statement.execute(sql.formatted(firstName, lastName, age));
            statement.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

}
