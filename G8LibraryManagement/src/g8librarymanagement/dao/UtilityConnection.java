/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class UtilityConnection {
    private Connection conn; // tạo biến Connect

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public UtilityConnection() {
    }

    public UtilityConnection(Connection conn) {
        this.conn = conn;
    }
    
    public void connect() {
        if(conn==null) {
             try {
            conn = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost;databasename=LibraryManagement;username=sa;password=123456"); //dùng để connect
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Connect Error : "+ex);
        }
//            if(conn!=null)
//                JOptionPane.showMessageDialog(null, "Connect Successfull !!!  ");
        }
    }
    
    public void disconnect(){
        if(conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Disconnect Error : "+ex);
            }
        }
        
    }
}
