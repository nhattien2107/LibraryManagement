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
public class borrowed_ticket_detail {
    private int ticket_details_id;
    private int ticket_id;
    private int book_id;
    private int amount;

    public int getTicket_details_id() {
        return ticket_details_id;
    }

    public void setTicket_details_id(int ticket_details_id) {
        this.ticket_details_id = ticket_details_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public borrowed_ticket_detail() {
    }

    public borrowed_ticket_detail(int ticket_details_id, int ticket_id, int book_id, int amount) {
        this.ticket_details_id = ticket_details_id;
        this.ticket_id = ticket_id;
        this.book_id = book_id;
        this.amount = amount;
    }

    
}
