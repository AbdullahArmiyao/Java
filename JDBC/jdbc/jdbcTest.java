package JDBC.jdbc;

import java.sql.*;
import java.lang.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jdbcTest{
    public static void main(String[] args) {
        //Use Scanner fot input
        Scanner sc = new Scanner(System.in);

        //Set Parameters and take input
        System.out.print("Enter user id: ");
        int id_users = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter first name: ");
        String fname = sc.nextLine();
        System.out.print("Enter last name: ");
        String lname = sc.nextLine();
        System.out.print("Enter email: ");
        String mail = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        //Establish Connection
        try(Connection JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "dollaman")){
            String query = "INSERT INTO users VALUES(?, ?, ?, ?, ?)", query2 = "select * from users";
            PreparedStatement statement = JDBC.prepareStatement(query);
            statement.setInt(1, id_users);
            statement.setString(2, fname);
            statement.setString(3, lname);
            statement.setString(4, mail);
            statement.setString(5, pass);


            int rowInserted = statement.executeUpdate();
            if(rowInserted > 0){
                System.out.println("Your account has been created successfully!");
                System.out.println();
            }


            //printing every member in the table
            PreparedStatement statement2 = JDBC.prepareStatement(query2);
            ResultSet rs = statement2.executeQuery();
            while(rs.next()){
                String id = rs.getString("id_users");
                String fnamee = rs.getString("first_name");
                String lnamee = rs.getString("last_name");
                String email = rs.getString("email");
                String passs = rs.getString("password");
                String row = id + "\t" + fnamee + "\t" + lnamee + "\t" + email + "\t" + passs;

                System.out.println(row);
                System.out.println();


            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        //The exceptions below are summarized by the code above
        /*
        catch (ClassNotFoundException ex){
            Logger.getLogger(jdbcTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(jdbcTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        */

        finally {
         sc.close();
        }

    }
}
