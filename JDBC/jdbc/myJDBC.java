package JDBC.jdbc;

import java.sql.*;

public class myJDBC {
    public static void main(String[] args) {
        try {
            Connection JDBC = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "dollaman");
            //Using Statememt
            Statement statement = JDBC.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM employees");       //Execute query is what you use to perform the sql functions
            //Using Prepared Statement
            PreparedStatement statement1 = JDBC.prepareStatement("SELECT * FROM employees");
            ResultSet rs1 = statement1.executeQuery();       //Execute query is what you use to perform the sql functions

            while (rs.next()) {
                //Getting the columns from the table using the getString method
                String id = rs.getString("employee_id");
                String name = rs.getString("first_name");
                String namee = rs.getString("last_name");
                String hire = rs.getString("hire_date");
                String pay = rs.getString("hourly_pay");
                String phone = rs.getString("phone_number");
                /*
                System.out.println(rs.getString("employee_id"));
                System.out.println(rs.getString("first_name"));
                System.out.println(rs.getString("last_name"));
                System.out.println(rs.getString("hire_date"));
                System.out.println(rs.getString("hourly_pay"));
                System.out.println(rs.getString("phone_number"));
                */
                System.out.println(id+"\t"+name+"\t"+namee+"\t"+phone+"\t"+hire+"\t"+pay+"\t");
                System.out.println();


            }
            while (rs.next()) {
                //Getting the columns from the table using the getString method
                String id = rs1.getString("employee_id");
                String name = rs1.getString("first_name");
                String namee = rs1.getString("last_name");
                String hire = rs1.getString("hire_date");
                String pay = rs1.getString("hourly_pay");
                String phone = rs1.getString("phone_number");
                System.out.println(id+"\t"+name+"\t"+namee+"\t"+phone+"\t"+hire+"\t"+pay+"\t");
                System.out.println();

            }
            } catch (Exception e){
            e.printStackTrace();
        }

    }
}
