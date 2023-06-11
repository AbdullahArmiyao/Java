package JDBC.jdbc.SocialPlatform;

import java.util.*;
import java.sql.*;

public class userLoginPage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name , email, password;
        String q1, q2, q3;
        System.out.print("Enter New User Name: ");
        name = sc.nextLine();
        System.out.print("Enter Email: ");
        email = sc.nextLine();
        System.out.print("Enter Password: ");
        password = sc.nextLine();
        // q1 = "create table users (user_name VARCHAR(255) not null, email VARCHAR(255) not null unique, password VARCHAR(255) not Null)";
        q2 = "insert into users values(?, ?, ?) ";
        // q3 = "select * from users where user_name =  "+ name;

        try{
            Connection JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/socialplatform","root","dollaman");


            PreparedStatement st1 = JDBC.prepareStatement(q2);
            st1.setString(1, name);
            st1.setString(2, email);
            st1.setString(3, password);

            int rowinserted = st1.executeUpdate();
            if (rowinserted > 0 ) {
                System.out.println("New user added successfully!");
            }




        }catch(SQLIntegrityConstraintViolationException e){
            System.out.println("Username or email already exists");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}