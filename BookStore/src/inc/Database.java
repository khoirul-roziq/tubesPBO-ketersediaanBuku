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

    public void tambahData(String isbn, String judul, String penulis, String penerbit, String tahun, String tempat, String harga, String stok, String lokasi) throws SQLException {
        String query = "INSERT INTO book VALUES ('"+isbn+"', '"+judul+"', '"+penulis+"', '"+
                penerbit+"', '"+tahun+"', '"+tempat+"', "+harga+", "+stok+", '"
                +lokasi+"');";
        stm.execute(query);
    }

    public void hapusData(String isbn) throws SQLException {
        String query = "DELETE FROM book WHERE isbn = '"+isbn+"'";
        stm.execute(query);
    }

    public void updateData(String isbn, String judul, String lokasi, String penerbit, String penulis, String stock, String tahun, String tempat, String harga) throws SQLException {
        String query = "UPDATE book SET judul_buku = '"+judul+"' WHERE isbn = '"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET lokasi_penempatan = '"+lokasi+"' WHERE isbn = '"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET penerbit = '"+penerbit+"' WHERE isbn='"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET pengarang = '"+penulis+"' WHERE isbn='"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET tempat_terbit = '"+tempat+"' WHERE isbn='"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET tahun_terbit = "+tahun+" WHERE isbn='"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET harga = "+harga+" WHERE isbn='"+isbn+"'";
        stm.execute(query);
        query = "UPDATE book SET jumlah_stok = "+stock+" WHERE isbn='"+isbn+"'";
        stm.execute(query);
    }
    
    public boolean isAvailable(String isbn) throws SQLException{
        String query = "SELECT COUNT(judul_buku) FROM book WHERE isbn = '"+isbn+"'";
        rs = stm.executeQuery(query);
        String sum="";
        while(rs.next()){
            sum = rs.getString("COUNT(judul_buku)");
        }
        if(sum.equals("0"))return false;
        else return true;
    }

}
