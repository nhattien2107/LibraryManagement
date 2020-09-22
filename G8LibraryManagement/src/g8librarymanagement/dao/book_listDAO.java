/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.book_list;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class book_listDAO {
    private UtilityConnection uc;

    public book_listDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public boolean addNew(book_list book) {      
        String query ="INSERT INTO book_list(book_name,book_detail,fee_per_day,author_name,published_date,publisher_id,book_type_id)"
                + " VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query); 
            //ps.setInt   (1, book.getBook_id());
            ps.setString(1, book.getBook_name());
            ps.setString(2, book.getBook_detail());
            ps.setInt (3, book.getFee_per_day());
            ps.setString(4, book.getAuthor_name());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(5, sdf.format(book.getPublished_date()));
            ps.setInt(6, book.getPublisher_id());
            ps.setInt(7, book.getBook_type_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    public boolean update(book_list book) {
        String query ="UPDATE book_list SET book_name=?,book_detail=?,fee_per_day=?,author_name=?,published_date=?,publisher_id=?,book_type_id=? WHERE book_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, book.getBook_name());
            ps.setString   (2, book.getBook_detail());
            ps.setInt (3, book.getFee_per_day());
            ps.setString(4, book.getAuthor_name());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String pub_date=sdf.format(book.getPublished_date());
            ps.setString(5, pub_date);
            ps.setInt(6, book.getPublisher_id());
            ps.setInt(7, book.getBook_type_id());
            ps.setInt(8, book.getBook_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;
    }
    public boolean delete(book_list book) {
        String query ="DELETE FROM book_list WHERE book_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, book.getBook_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    public ArrayList<book_list> findALL() {
        ArrayList<book_list> arr=new ArrayList<book_list>();
        String query ="SELECT * FROM book_list";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                book_list bk = new book_list();
                bk.setBook_id(rs.getInt("book_id"));
                bk.setBook_name(rs.getString("book_name"));
                bk.setBook_detail(rs.getString("book_detail"));
                bk.setFee_per_day(rs.getInt("fee_per_day"));
                bk.setAuthor_name(rs.getString("author_name"));
                bk.setPublished_date(rs.getDate("published_date"));
                bk.setPublisher_id(rs.getInt("publisher_id"));
                bk.setBook_type_id(rs.getInt("book_type_id"));
                arr.add(bk);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public ArrayList<book_list> findByName(String name) {
        ArrayList<book_list> arr=new ArrayList<book_list>();
        String query ="SELECT * FROM book_list WHERE book_name like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                book_list bk = new book_list();
                bk.setBook_id(rs.getInt("book_id"));
                bk.setBook_name(rs.getString("book_name"));
                bk.setBook_detail(rs.getString("book_detail"));
                bk.setFee_per_day(rs.getInt("fee_per_day"));
                bk.setAuthor_name(rs.getString("author_name"));
                bk.setPublished_date(rs.getDate("published_date"));
                bk.setPublisher_id(rs.getInt("publisher_id"));
                bk.setBook_type_id(rs.getInt("book_type_id"));
                arr.add(bk);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public book_list findByID(int id) {
        book_list bk = new book_list();
        String query ="SELECT * FROM book_list WHERE book_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs                
                bk.setBook_id(rs.getInt("book_id"));
                bk.setBook_name(rs.getString("book_name"));
                bk.setBook_detail(rs.getString("book_detail"));
                bk.setFee_per_day(rs.getInt("fee_per_day"));
                bk.setAuthor_name(rs.getString("author_name"));
                bk.setPublished_date(rs.getDate("published_date"));
                bk.setPublisher_id(rs.getInt("publisher_id"));
                bk.setBook_type_id(rs.getInt("book_type_id"));
                return bk;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return null;
    }
}
