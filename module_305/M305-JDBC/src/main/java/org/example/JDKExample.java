package org.example;
import java.sql.*;
import java.util.Scanner;

public class JDKExample {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "AU:i_YsBQ77y";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first name of the employee you want to search for: ");
            String input = scanner.nextLine();
            String SelectSQL = "Select * FROM employees where firstname = ?";

            PreparedStatement stmt = connection.prepareStatement(SelectSQL);
            stmt.setString(1, input);

            ResultSet result = stmt.executeQuery();
            //use prepared statements instead of regular statements
            // '; drop table employees;

            //Statement stmt = connection.createStatement();
            //ResultSet result =  stmt.executeQuery(SelectSQL);
            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
