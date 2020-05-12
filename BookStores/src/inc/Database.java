/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.PanelSearch;

/**
 *
 * @author Muhammad Alfarizi
 */
public class Database {
    public static Connection con;
    public static Statement stm;
    private static ResultSet rs;
    
    public Database() throws SQLException{
        con = DriverManager.getConnection("jdbc:mysql://localhost/toko_buku","root","");
        stm = con.createStatement();
    }
  
    public boolean login(String uname, String pass) throws SQLException{
        boolean valid = false;
        String query = "SELECT * FROM administrator WHERE username = '"+uname+"'";
        rs = stm.executeQuery(query);
        if(rs.next()){
            if(uname.equals(rs.getString("username"))&& pass.equals(rs.getString("password"))){
                valid = true;
            }
        }
        return valid;
    }
    
    public ResultSet tampilBuku(String query) throws SQLException{
        rs = stm.executeQuery(query);
        return rs;
    }
}
