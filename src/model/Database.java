package model;

import java.sql.*;

public class Database{

    private Connection conn;

    public void connect() throws Exception {
        if (conn != null) return ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Driver not found");
        }

        String connectionUrl = "jdbc:mysql://localhost:3306/project";
        conn = DriverManager.getConnection(connectionUrl,"root","abc123");
    }


    public void save(String value, double value1, int value2, double value3, double value4, double value5) throws SQLException {
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "insert into burger (burgername,price,maxtopping,priceoftopping,taxamount,totalprice) VALUES('"+value +"','"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')";
            // System.out.println(sql);
            stmt.executeUpdate(sql);
        } catch (SQLException throwable) {
            throw throwable;
        }
    }
    public  void disconnect(){
        try {
            conn.close();
        } catch (SQLException throwable) {
            System.out.println("Can't close the connection");
        }
    }




}


