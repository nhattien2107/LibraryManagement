/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.dao;
import g8librarymanagement.model.borrowed_ticket_detail;
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
public class borrowed_ticket_detailDAO {
    private UtilityConnection uc;

    public borrowed_ticket_detailDAO() {
        uc=new UtilityConnection();
        uc.connect();
    }
    public boolean addNew(borrowed_ticket_detail ticketD) {      
        String query ="INSERT INTO borrowed_ticket_detail(ticket_id,book_id,amount) VALUES(?,?,?)";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);
            ps.setInt   (1, ticketD.getTicket_id());
            ps.setInt   (2, ticketD.getBook_id());
            ps.setInt   (3, ticketD.getAmount());
            return ps.executeUpdate()>0; //thực thi câu lệnh query Add new
        } catch (SQLException ex) {
//            Logger.getLogger(employee_listDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Add New Error!!");
        }
        return false;
    }
    public boolean update(borrowed_ticket_detail ticketD) {
        String query ="UPDATE borrowed_ticket_detail SET ticket_id=?,book_id=?,amount=? WHERE ticket_details_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);
            
            ps.setInt   (1, ticketD.getTicket_id());
            ps.setInt   (2, ticketD.getBook_id());
            ps.setInt   (3, ticketD.getAmount());
            ps.setInt   (4, ticketD.getTicket_details_id());
            
            return ps.executeUpdate()>0; //thực thi câu lệnh query Update
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error!!");
        }
        return false;
    }
    public boolean delete(borrowed_ticket_detail ticketD) {
        String query ="DELETE FROM borrowed_ticket_detail WHERE ticket_details_id=?";
        try {
            PreparedStatement ps= uc.getConn().prepareStatement(query);  
            ps.setInt   (1, ticketD.getTicket_details_id());
            
            return ps.executeUpdate()>0; //thực thi câu lệnh query Delete
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Delete Error!!");
        }
        return false;
    }
    public ArrayList<borrowed_ticket_detail> findALL() {
        ArrayList<borrowed_ticket_detail> arr=new ArrayList<borrowed_ticket_detail>();
        String query ="SELECT * FROM borrowed_ticket_detail";
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                borrowed_ticket_detail tkd = new borrowed_ticket_detail();
                tkd.setTicket_details_id(rs.getInt("ticket_details_id"));
                tkd.setTicket_id(rs.getInt("ticket_id"));
                tkd.setBook_id(rs.getInt("book_id"));
                tkd.setAmount(rs.getInt("amount"));
                arr.add(tkd);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public ArrayList<borrowed_ticket_detail> findByTicketID(int id) {
        ArrayList<borrowed_ticket_detail> arr=new ArrayList<borrowed_ticket_detail>();
        String query ="SELECT * FROM borrowed_ticket_detail WHERE ticket_id="+id;;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs
                borrowed_ticket_detail tkd = new borrowed_ticket_detail();
                tkd.setTicket_details_id(rs.getInt("ticket_details_id"));
                tkd.setTicket_id(rs.getInt("ticket_id"));
                tkd.setBook_id(rs.getInt("book_id"));
                tkd.setAmount(rs.getInt("amount"));
                arr.add(tkd);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        return arr;
    }
    public borrowed_ticket_detail findByID(int id) {
        borrowed_ticket_detail tkd = new borrowed_ticket_detail();
        String query ="SELECT * FROM borrowed_ticket_detail WHERE ticket_details_id="+id;
        try {
            Statement stm = uc.getConn().createStatement(); //thực thi câu lệnh query 
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) { // có kết quả rs          
                tkd.setTicket_details_id(rs.getInt("ticket_details_id"));
                tkd.setTicket_id(rs.getInt("ticket_id"));
                tkd.setBook_id(rs.getInt("book_id"));
                tkd.setAmount(rs.getInt("amount"));
                return tkd;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Connection Error!!");
        }
        return null;
    }
}
