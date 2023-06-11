package JDBC.jdbc;

import java.sql.*;
import java.util.*;

public class shopManagement {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        //Option to create a new shop table
        System.out.println("Do you want to create a new Shop?\n(1=Yes)\t(2=No)");
        int res = sc.nextInt();
        sc.nextLine();

        //Getting the shop name to either create or update
        System.out.print("Enter shop name: ");
        String shopname = sc.nextLine();

        //Queries
        String query1 = "CREATE table "+shopname+" (id INTEGER not Null primary key, name VARCHAR(255) unique, price INTEGER not Null, in_stock INTEGER not Null)";
        String query2 = "INSERT INTO " +shopname+ " VALUES(?, ?, ?, ?)";
        String query3 = "SELECT * FROM " + shopname;




        //Connect to SQL
        try {
            Connection JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "dollaman");

            PreparedStatement st = JDBC.prepareStatement(query1);


            if(res == 1){
                st.executeUpdate();
            }
            else if(res == 2){
                System.out.println("You may Proceed");
            }


            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Product Price: ");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Number In Stock: ");
            int in_stock = sc.nextInt();
            sc.nextLine();
            PreparedStatement stm = JDBC.prepareStatement(query2);
            stm.setInt(1, id);
            stm.setString(2, name);
            stm.setInt(3, price);
            stm.setInt(4, in_stock);
            int rowInserted = stm.executeUpdate();
            if(rowInserted > 0){
                System.out.println("Item added Succesfully");
                System.out.println();
            }

            PreparedStatement stm2 = JDBC.prepareStatement(query3);
            ResultSet rss = stm2.executeQuery();

            while (rss.next()){
                String idd = rss.getString("id");
                String namee = rss.getString("name");
                String pricee = rss.getString("price");
                String stock = rss.getString("in_stock");
                System.out.println(idd + "\t" + namee + "\t" + pricee + "\t" + stock);
            }









        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
