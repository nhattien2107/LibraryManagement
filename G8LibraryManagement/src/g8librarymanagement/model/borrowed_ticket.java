/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.model;
import java.util.*;
/**
 *
 * @author Admin
 */
public class borrowed_ticket {
    private int ticket_id;
    private int member_id;
    private Date ticket_date;
    private Date return_date;
    private int employee_id;
    private int ticket_status;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public Date getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(Date ticket_date) {
        this.ticket_date = ticket_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getTicket_status() {
        return ticket_status;
    }

    public void setTicket_status(int ticket_status) {
        this.ticket_status = ticket_status;
    }

    public borrowed_ticket() {
    }

    public borrowed_ticket(int ticket_id, int member_id, Date ticket_date, Date return_date, int employee_id, int ticket_status) {
        this.ticket_id = ticket_id;
        this.member_id = member_id;
        this.ticket_date = ticket_date;
        this.return_date = return_date;
        this.employee_id = employee_id;
        this.ticket_status = ticket_status;
    }
    
}
