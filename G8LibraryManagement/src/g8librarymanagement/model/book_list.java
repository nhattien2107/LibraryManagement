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
public class book_list {
    private int book_id;
    private String book_name;
    private String book_detail;
    private int fee_per_day;
    private String author_name;
    private Date published_date;
    private int publisher_id;
    private int book_type_id;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_detail() {
        return book_detail;
    }

    public void setBook_detail(String book_detail) {
        this.book_detail = book_detail;
    }

    public int getFee_per_day() {
        return fee_per_day;
    }

    public void setFee_per_day(int fee_per_day) {
        this.fee_per_day = fee_per_day;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public int getBook_type_id() {
        return book_type_id;
    }

    public void setBook_type_id(int book_type_id) {
        this.book_type_id = book_type_id;
    }

    public book_list() {
    }

    public book_list(int book_id, String book_name, String book_detail, int fee_per_day, String author_name, Date published_date, int publisher_id, int book_type_id) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_detail = book_detail;
        this.fee_per_day = fee_per_day;
        this.author_name = author_name;
        this.published_date = published_date;
        this.publisher_id = publisher_id;
        this.book_type_id = book_type_id;
    }
}
