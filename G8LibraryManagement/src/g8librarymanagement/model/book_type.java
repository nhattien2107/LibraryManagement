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
public class book_type {
    private int book_type_id;
    private String book_type_name;

    public int getBook_type_id() {
        return book_type_id;
    }

    public void setBook_type_id(int book_type_id) {
        this.book_type_id = book_type_id;
    }

    public String getBook_type_name() {
        return book_type_name;
    }

    public void setBook_type_name(String book_type_name) {
        this.book_type_name = book_type_name;
    }

    public book_type() {
    }

    public book_type(int book_type_id, String book_type_name) {
        this.book_type_id = book_type_id;
        this.book_type_name = book_type_name;
    }

    
}
