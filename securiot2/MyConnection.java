/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securiot2;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MyConnection {
    
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unkn0wn", "root", "");
          //  JOptionPane.showMessageDialog(null, "Connected!!");
        }
        catch(Exception e){
             System.out.println(e.getMessage());
        }
        return con;
    }
    
    
}
