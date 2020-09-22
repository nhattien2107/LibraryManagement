/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.member;
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
public class memberDAO {
    private UtilityConnection uc;

    public memberDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    
    public boolean addNew(member member) {
        String query ="INSERT INTO member(member_email,member_name,member_address,member_phone,member_DOB,member_gender) "
                + "VALUES(?,?,?,?,?,?)";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, member.getMember_email());
            ps.setString(2, member.getMember_name());
            ps.setString(3, member.getMember_address());
            ps.setString(4, member.getMember_phone());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(5, sdf.format(member.getMember_DOB()));
            ps.setInt   (6, member.getMember_gender());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    
    public boolean update(member member) {
        String query ="UPDATE member SET member_email=?, member_name=?, member_address=?,"
                    + "member_phone=?, member_DOB=?, member_gender=? WHERE member_id=?";
        try {            
        PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, member.getMember_email());
            ps.setString(2, member.getMember_name());
            ps.setString(3, member.getMember_address());
            ps.setString(4, member.getMember_phone());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(member.getMember_DOB());
            ps.setString(5, dob);
            ps.setInt   (6, member.getMember_gender());
            ps.setInt   (7, member.getMember_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;        
    }
    
    public boolean delete(member member) {
        String query ="DELETE FROM member WHERE member_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, member.getMember_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    
    public ArrayList<member> findAll() {
        ArrayList<member> arr=new ArrayList<member>();
        String query ="SELECT * FROM member";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                member mem = new member();
                mem.setMember_id(rs.getInt("member_id"));
                mem.setMember_email(rs.getString("member_email"));
                mem.setMember_name(rs.getString("member_name"));
                mem.setMember_address(rs.getString("member_address"));
                mem.setMember_phone(rs.getString("member_phone"));
                mem.setMember_DOB(rs.getDate("member_DOB"));
                mem.setMember_gender(rs.getInt("member_gender"));              
                arr.add(mem);
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    
    public ArrayList<member> findByName(String name) {
        ArrayList<member> arr=new ArrayList<member>();
        String query ="SELECT * FROM member WHERE member_name like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                member mem = new member();
                mem.setMember_id(rs.getInt("member_id"));
                mem.setMember_email(rs.getString("member_email"));
                mem.setMember_name(rs.getString("member_name"));
                mem.setMember_address(rs.getString("member_address"));
                mem.setMember_phone(rs.getString("member_phone"));
                mem.setMember_DOB(rs.getDate("member_DOB"));
                mem.setMember_gender(rs.getInt("member_gender"));              
                arr.add(mem);
            }            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return arr;
    }
    
    public member findByID(int id) {
        member mem = new member();
        String query ="SELECT * FROM member WHERE member_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs                
                mem.setMember_id(rs.getInt("member_id"));
                mem.setMember_email(rs.getString("member_email"));
                mem.setMember_name(rs.getString("member_name"));
                mem.setMember_address(rs.getString("member_address"));
                mem.setMember_phone(rs.getString("member_phone"));
                mem.setMember_DOB(rs.getDate("member_DOB"));
                mem.setMember_gender(rs.getInt("member_gender"));  
                return mem;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Search Error!!");
        }
        return null;
    }
}
