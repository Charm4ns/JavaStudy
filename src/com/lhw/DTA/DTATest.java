package com.lhw.DTA;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DTATest {
    public static void main(String[] args) throws SQLException {
        try {Class.forName("org.postgresql.Driver");}
//loading the driver
        catch (ClassNotFoundException e) {
            System.out.println("Could not find JDBC Driver");
            e.printStackTrace();
            return;}
        Connection connection = null; //connection object
        try {
            connection = DriverManager.
                    getConnection("jdbc:postgresql://localhost:5432/",
                            "postgres", "postgres"); //connection address
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return;}
        if (connection != null) //connection established
            System.out.println("Controlling your database...");
        else //connection not successfully established
            System.out.println("Failed to establish connection!");

        Statement statement = connection.createStatement();
        String SQL = "CREATE TABLE STUDENTS" +
        "(ID INTEGER NOT NULL, " +
        "NAME VARCHAR(25), " +
        "GPA REAL DEFAULT 0.0, " +
        "PRIMARY KEY (ID) )" ;
//Create the table with updating the database…
        statement.executeUpdate(SQL);

        connection.close();
        statement.close();
    }//main method


}
