/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.nation;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class nationDAO {
    private UtilityConnection uc;

    public nationDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    
    public boolean addNew(nation na) {
        String query ="INSERT INTO nation(nation_name) VALUES(?)";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, na.getNation_name());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    
    public boolean update(nation na) {
        String query ="UPDATE nation SET nation_name=? WHERE nation_id=?";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);             
            ps.setString(1, na.getNation_name());
            ps.setInt   (2, na.getNation_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;       
    }
    
    public boolean delete(nation na) {
        String query ="DELETE FROM nation WHERE nation_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, na.getNation_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    
    public ArrayList<nation> findAll() {
        ArrayList<nation> arr=new ArrayList<nation>();
        String query ="SELECT * FROM nation";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                nation na = new nation();
                na.setNation_id(rs.getInt("nation_id"));
                na.setNation_name(rs.getString("nation_name"));             
                arr.add(na);
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return arr;
    }
    
    public nation findByName(String name) {
        nation na = new nation();
        String query ="SELECT * FROM nation WHERE nation_name like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs              
                na.setNation_id(rs.getInt("nation_id"));
                na.setNation_name(rs.getString("nation_name"));             
                return na;
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return null;
    }
    
    public nation findByID(int id) {
        nation na = new nation();
        String query ="SELECT * FROM nation WHERE nation_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs     
                na.setNation_id(rs.getInt("nation_id"));
                na.setNation_name(rs.getString("nation_name"));             
                return na;
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return null;            
    }
}
