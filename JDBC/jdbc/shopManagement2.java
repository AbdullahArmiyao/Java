package JDBC.jdbc;

import java.util.*;
import java.sql.*;

public class shopManagement2 {
    static Scanner sc = new Scanner(System.in);
    static shopManagement sm = new shopManagement();
    public static void main(String[] args) {
        //How user wants to update table info
        try {
            Connection JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "dollaman");
            System.out.println("Create or Make Changes To Existing Table? (1=Create)\t(2=Update)");
            int ress = sc.nextInt();
            sc.nextLine();
            if (ress == 1) {
                sm.main();
            } else if (ress == 2) {

                System.out.print("Enter table name: ");
                String tablename = sc.nextLine(), q = "Select * from " + tablename;
                PreparedStatement st = JDBC.prepareStatement(q);
                ResultSet rs = st.executeQuery();
                while (rs.next()){
                    String idd = rs.getString("id"), namee = rs.getString("name"), pricee = rs.getString("price"), stockk = rs.getString("in_stock");
                    System.out.println(idd + "\t" + namee + "\t" + pricee + "\t" + stockk );
                }

                System.out.println("How would you want to update your shop?\n(1=Remove Item)\t(2=Change Price)\t(3=Update Stock)");
                int res = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter item id: ");
                int id = sc.nextInt();
                sc.nextLine();

                String q1, q2, q3;
                int price, in_stock;
                PreparedStatement st1, st2, st3;

                if (res == 1) {
                    q1 = "delete from " + tablename + " where id = " + id;
                    st1 = JDBC.prepareStatement(q1);
                    st1.executeUpdate();
                } else if (res == 2) {
                    System.out.print("Enter New Price: ");
                    price = sc.nextInt();
                    sc.nextLine();
                    q2 = "update " + tablename + " set price = " + price + " where id = " + id;
                    st2 = JDBC.prepareStatement(q2);
                    st2.executeUpdate();
                }else if (res == 3) {
                    System.out.print("What is in stock now?: ");
                    in_stock = sc.nextInt();
                    sc.nextLine();
                    q3 = "update " + tablename + " set in_stock = " + in_stock + " where id = " + id;
                    st3 = JDBC.prepareStatement(q3);
                    st3.executeUpdate();
                }






                rs = st.executeQuery();
                while (rs.next()){
                    String idd = rs.getString("id");
                    String namee = rs.getString("name");
                    String pricee = rs.getString("price");
                    String stockk = rs.getString("in_stock");
                    System.out.println(idd + "\t" + namee + "\t" + pricee + "\t" + stockk );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

