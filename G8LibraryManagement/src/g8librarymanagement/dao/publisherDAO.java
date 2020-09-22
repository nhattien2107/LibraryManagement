/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.publisher;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class publisherDAO {
    private UtilityConnection uc;

    public publisherDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    
    public boolean addNew(publisher pub) {
        String query ="INSERT INTO publisher(publisher_name,nation_id) VALUES(?,?)";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, pub.getPublisher_name());
            ps.setInt   (2, pub.getNation_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    
    public boolean update(publisher pub) {
        String query ="UPDATE publisher SET publisher_name=?, nation_id=? WHERE publisher_id=?";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, pub.getPublisher_name());
            ps.setInt   (2, pub.getNation_id());
            ps.setInt   (3, pub.getPublisher_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;       
    }
    
    public boolean delete(publisher pub) {
        String query ="DELETE FROM publisher WHERE publisher_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, pub.getPublisher_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    
    public ArrayList<publisher> findAll() {
        ArrayList<publisher> arr=new ArrayList<publisher>();
        String query ="SELECT * FROM publisher";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                publisher pub = new publisher();
                pub.setPublisher_id(rs.getInt("publisher_id"));
                pub.setPublisher_name(rs.getString("publisher_name")); 
                pub.setNation_id(rs.getInt("nation_id"));
                arr.add(pub);
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return arr;
    }
    
    public ArrayList<publisher> findByName(String name) {
        ArrayList<publisher> arr=new ArrayList<publisher>();
        String query ="SELECT * FROM publisher WHERE publisher_name like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                publisher pub = new publisher();
                pub.setPublisher_id(rs.getInt("publisher_id"));
                pub.setPublisher_name(rs.getString("publisher_name")); 
                pub.setNation_id(rs.getInt("nation_id"));
                arr.add(pub);
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return arr;
    }
    
    public publisher findByID(int id) {
        publisher pub = new publisher();
        String query ="SELECT * FROM publisher WHERE publisher_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs     
                pub.setPublisher_id(rs.getInt("publisher_id"));
                pub.setPublisher_name(rs.getString("publisher_name"));     
                pub.setNation_id(rs.getInt("nation_id"));
                return pub;
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return null;            
    }
}
