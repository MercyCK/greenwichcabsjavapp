/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

/*added Java DB Driver to the library which is the driver for Derby database, only then
you can run the program.*/
import javax.swing.*;


/**
 *
 * @author Mercyck
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/technosoft","root","05121989");
            Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527/GreenwichCabs","greenwich","cabs");
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
