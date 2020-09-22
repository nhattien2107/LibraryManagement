/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.book_type;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class book_typeDAO {
    private UtilityConnection uc;

    public book_typeDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public boolean addNew(book_type bookT) {      
        String query ="INSERT INTO book_type(book_type_name) VALUES(?)";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query); 
            ps.setString(1, bookT.getBook_type_name());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    public boolean update(book_type bookT) {
        String query ="UPDATE book_type SET book_type_name=? WHERE book_type_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            
            ps.setString(1, bookT.getBook_type_name());
            ps.setInt   (2, bookT.getBook_type_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;
    }
    public boolean delete(book_type bookT) {
        String query ="DELETE FROM book_type WHERE book_type_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, bookT.getBook_type_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    public ArrayList<book_type> findALL() {
        ArrayList<book_type> arr=new ArrayList<book_type>();
        String query ="SELECT * FROM book_type";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                book_type bt = new book_type();
                bt.setBook_type_id(rs.getInt("book_type_id"));
                bt.setBook_type_name(rs.getString("book_type_name"));
                arr.add(bt);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public ArrayList<book_type> findByName(String name) {
        ArrayList<book_type> arr=new ArrayList<book_type>();
        String query ="SELECT * FROM book_type WHERE book_type_name like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                book_type bt = new book_type();
                bt.setBook_type_id(rs.getInt("book_type_id"));
                bt.setBook_type_name(rs.getString("book_type_name"));
                arr.add(bt);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public book_type findByID(int id) {
        book_type bt = new book_type();
        String query ="SELECT * FROM book_type WHERE book_type_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs  
                bt.setBook_type_id(rs.getInt("book_type_id"));
                bt.setBook_type_name(rs.getString("book_type_name"));
                return bt;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return null;
    }
}
