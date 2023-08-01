package com.herbalife.examples;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
CREATE PROCEDURE sp_selPersonsWithAgeGt(
    IN ageParam int
)
BEGIN
    SELECT *
    FROM persons
    WHERE age > ageParam;
END
 */

public class MoreJdbc {
    public static void main(String[] args) throws SQLException {
        //insertPersonUsingStatement("Jane", "Doe", 12);
        //insertPersonUsingPreparedStatement("Ram", "Narain", 32);
        List<Person> persons = loadAllPersonsUsingPreparedStatement();
        persons.forEach(System.out::println);

        //System.out.println("**********Executing stored proc");
        //printAllPersonsWithAgeGtUsingAStoredProcedure(35);
    }

    private static void printAllPersonsWithAgeGtUsingAStoredProcedure(int age) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root");
            String sql = "call sp_selPersonsWithAgeGt(?)";
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.setInt("ageParam", age);
            ResultSet resultSet = callableStatement.executeQuery();
            while(resultSet.next()) {
                Person person = new Person(resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"));
                System.out.println(person);
            }
            resultSet.close();
            callableStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    private static List<Person> loadAllPersonsUsingPreparedStatement() throws SQLException {
        List<Person> persons = new ArrayList<>();
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root");

            String sql = "select * from persons where first_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Joe");
            ResultSet resultSet = preparedStatement.executeQuery();
            //ResultSet is active as long as the connection is open
            while(resultSet.next()) {
                Person person = new Person(resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"));
                persons.add(person);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return persons;
    }

    private static List<Person> loadAllPersons() throws SQLException {
        List<Person> persons = new ArrayList<>();
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root");
            Statement statement = connection.createStatement();
            String sql = "select * from persons";
            ResultSet resultSet = statement.executeQuery(sql);
            //ResultSet is active as long as the connection is open
            while(resultSet.next()) {
                Person person = new Person(resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getInt("age"));
                persons.add(person);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return persons;
    }

    private static void insertPersonUsingPreparedStatement(String firstName, String lastName, int age) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root");
            String sql = "insert into persons(first_name, last_name, age) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //You can loop through a collection of names and execute
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setInt(3, age);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    private static void insertPersonUsingStatement(String firstName, String lastName, int age) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root");
            Statement statement = connection.createStatement();
            String sql = "insert into persons(first_name, last_name, age) values('%s', '%s', %s)".formatted(firstName, lastName, age);
            statement.execute(sql);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    private static void insertPersonUsingStatement2(String firstName, String lastName, int age) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/training", "root", "root")) {
            Statement statement = connection.createStatement();
            String sql = "insert into persons(first_name, last_name, age) values('%s', '%s', %s)".formatted(firstName, lastName, age);
            statement.execute(sql);
            statement.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }

}
