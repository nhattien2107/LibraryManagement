/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.employee_list;
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
public class employee_listDAO {
    private UtilityConnection uc;

    public employee_listDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    
    public employee_list findemployee_listByUserPass(String user, String pass) {
        String query = "SELECT * FROM employee_list WHERE username='"+user+"' and pass='"+pass+"'"; // truy vấn SQL
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                employee_list em = new employee_list();
                em.setEmployee_id(rs.getInt("employee_id"));
                em.setFullname(rs.getString("fullname"));
                em.setGender(rs.getInt("gender"));
                em.setSalary(rs.getInt("salary"));
                em.setPosition(rs.getString("position"));
                em.setUsername(rs.getString("username"));
                em.setPass(rs.getString("pass"));
                em.setDOB(rs.getDate("DOB"));
                em.setEmail(rs.getString("Email"));
                em.setPhone(rs.getString("Phone"));
                return em;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error!!");
        }
    return null;           
    }
    
    public boolean addNew(employee_list employee) {      
        String query ="INSERT INTO employee_list(fullname,gender,salary,position,username,pass,DOB,Email,Phone) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query); 
            ps.setString(1, employee.getFullname());
            ps.setInt   (2, employee.getGender());
            ps.setInt (3, employee.getSalary());
            ps.setString(4, employee.getPosition());
            ps.setString(5, employee.getUsername());
            ps.setString(6, employee.getPass());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(7, sdf.format(employee.getDOB()));
            ps.setString(8, employee.getEmail());
            ps.setString(9, employee.getPhone());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
//            Logger.getLogger(employee_listDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    
    public boolean update(employee_list employee) {
        String query ="UPDATE employee_list SET fullname=?, gender=?";
               query+=", salary=?, position=?, username=?, pass=?, DOB=?, Email=?, Phone=?";
               query+=" WHERE employee_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setString(1, employee.getFullname());
            ps.setInt   (2, employee.getGender());
            ps.setInt (3, employee.getSalary());
            ps.setString(4, employee.getPosition());
            ps.setString(5, employee.getUsername());
            ps.setString(6, employee.getPass());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String dob=sdf.format(employee.getDOB());
            ps.setString(7, dob);
            ps.setString(8, employee.getEmail());
            ps.setString(9,employee.getPhone());
            ps.setInt   (10, employee.getEmployee_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;
    }
    
    public boolean delete(employee_list employee) {
        String query ="DELETE FROM employee_list WHERE employee_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt(1, employee.getEmployee_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    
    public ArrayList<employee_list> findALL() {
        ArrayList<employee_list> arr=new ArrayList<employee_list>();
        String query ="SELECT * FROM employee_list";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                employee_list em = new employee_list();
                em.setEmployee_id(rs.getInt("employee_id"));
                em.setFullname(rs.getString("fullname"));
                em.setGender(rs.getInt("gender"));
                em.setSalary(rs.getInt("salary"));
                em.setPosition(rs.getString("position"));
                em.setUsername(rs.getString("username"));
                em.setPass(rs.getString("pass"));
                em.setDOB(rs.getDate("DOB"));
                em.setEmail(rs.getString("Email"));
                em.setPhone(rs.getString("Phone"));
                arr.add(em);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    
    public ArrayList<employee_list> findByName(String name) {
        ArrayList<employee_list> arr=new ArrayList<employee_list>();
        String query ="SELECT * FROM employee_list WHERE fullname like '%"+name+"%'";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                employee_list em = new employee_list();
                em.setEmployee_id(rs.getInt("employee_id"));
                em.setFullname(rs.getString("fullname"));
                em.setGender(rs.getInt("gender"));
                em.setSalary(rs.getInt("salary"));
                em.setPosition(rs.getString("position"));
                em.setUsername(rs.getString("username"));
                em.setPass(rs.getString("pass"));
                em.setDOB(rs.getDate("DOB"));
                em.setEmail(rs.getString("Email"));
                em.setPhone(rs.getString("Phone"));
                arr.add(em);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    
    public employee_list findByID(int id) {
        employee_list em = new employee_list();
        String query ="SELECT * FROM employee_list WHERE employee_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs                
                em.setEmployee_id(rs.getInt("employee_id"));
                em.setFullname(rs.getString("fullname"));
                em.setGender(rs.getInt("gender"));
                em.setSalary(rs.getInt("salary"));
                em.setPosition(rs.getString("position"));
                em.setUsername(rs.getString("username"));
                em.setPass(rs.getString("pass"));
                em.setDOB(rs.getDate("DOB"));
                em.setEmail(rs.getString("Email"));
                em.setPhone(rs.getString("Phone"));
                return em;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error!!");
        }
        return null;
    }
}
