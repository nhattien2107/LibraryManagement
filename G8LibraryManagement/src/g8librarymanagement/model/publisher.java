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
public class publisher {
    private int publisher_id;
    private String publisher_name;
    private int nation_id;

    public int getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(int publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public int getNation_id() {
        return nation_id;
    }

    public void setNation_id(int nation_id) {
        this.nation_id = nation_id;
    }

    public publisher() {
    }

    public publisher(int publisher_id, String publisher_name, int nation_id) {
        this.publisher_id = publisher_id;
        this.publisher_name = publisher_name;
        this.nation_id = nation_id;
    }
    
}
