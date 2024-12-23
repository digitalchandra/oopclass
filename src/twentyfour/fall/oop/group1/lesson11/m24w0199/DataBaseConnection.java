package twentyfour.fall.oop.group1.lesson11.m24w0199;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DataBaseConnection {

     Connection connection;
     Statement statement;

    public  DataBaseConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system",
                    "root",
                    "nepal123"
            );
            statement=connection.createStatement();
            System.out.println("Database connection established successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
