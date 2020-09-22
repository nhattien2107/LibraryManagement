/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.borrowed_ticket;
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
public class borrowed_ticketDAO {
    private UtilityConnection uc;

    public borrowed_ticketDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public boolean addNew(borrowed_ticket ticket) {      
        String query ="INSERT INTO borrowed_ticket(member_id,ticket_date,return_date,ticket_status,employee_id) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);
            ps.setInt       (1, ticket.getMember_id());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString    (2, sdf.format(ticket.getTicket_date()));
            ps.setString    (3, sdf.format(ticket.getReturn_date()));
            ps.setInt       (4, ticket.getTicket_status());
            ps.setInt       (5, ticket.getEmployee_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
//            Logger.getLogger(employee_listDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    public boolean update(borrowed_ticket ticket) {
        String query ="UPDATE borrowed_ticket SET member_id=?,ticket_date=?,return_date=?,ticket_status=?,employee_id=? WHERE ticket_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt       (1, ticket.getMember_id());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            ps.setString    (2, sdf.format(ticket.getTicket_date()));
            ps.setString    (3, sdf.format(ticket.getReturn_date()));
            ps.setInt       (4, ticket.getTicket_status());
            ps.setInt       (5, ticket.getEmployee_id());
            ps.setInt       (6, ticket.getTicket_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;
    }
    public boolean delete(borrowed_ticket ticket) {
        String query ="DELETE FROM borrowed_ticket WHERE ticket_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt       (1, ticket.getTicket_id());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    public ArrayList<borrowed_ticket> findALL() {
        ArrayList<borrowed_ticket> arr=new ArrayList<borrowed_ticket>();
        String query ="SELECT * FROM borrowed_ticket";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                borrowed_ticket tk = new borrowed_ticket();
                tk.setTicket_id(rs.getInt("ticket_id"));
                tk.setMember_id(rs.getInt("member_id"));
                tk.setTicket_date(rs.getDate("ticket_date"));
                tk.setReturn_date(rs.getDate("return_date"));
                tk.setTicket_status(rs.getInt("ticket_status"));
                tk.setEmployee_id(rs.getInt("employee_id"));
                arr.add(tk);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public ArrayList<borrowed_ticket> findByEmployeeId(int id) {
        ArrayList<borrowed_ticket> arr=new ArrayList<borrowed_ticket>();
        String query ="SELECT * FROM borrowed_ticket WHERE employee_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                borrowed_ticket tk = new borrowed_ticket();
                tk.setTicket_id(rs.getInt("ticket_id"));
                tk.setMember_id(rs.getInt("member_id"));
                tk.setTicket_date(rs.getDate("ticket_date"));
                tk.setReturn_date(rs.getDate("return_date"));
                tk.setTicket_status(rs.getInt("ticket_status"));
                tk.setEmployee_id(rs.getInt("employee_id"));
                arr.add(tk);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public borrowed_ticket findByID(int id) {
        borrowed_ticket tk = new borrowed_ticket();
        String query ="SELECT * FROM borrowed_ticket WHERE ticket_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs                
                tk.setTicket_id(rs.getInt("ticket_id"));
                tk.setMember_id(rs.getInt("member_id"));
                tk.setTicket_date(rs.getDate("ticket_date"));
                tk.setReturn_date(rs.getDate("return_date"));
                tk.setTicket_status(rs.getInt("ticket_status"));
                tk.setEmployee_id(rs.getInt("employee_id"));
                return tk;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error!!");
        }
        return null;
    }
}
