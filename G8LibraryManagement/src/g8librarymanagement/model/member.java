/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.model;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Admin
 */
public class member {
    private int    member_id;
    private String member_email;
    private String member_name;
    private String member_address;
    private String member_phone;  
    private Date   member_DOB;
    private int    member_gender;

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getMember_address() {
        return member_address;
    }

    public void setMember_address(String member_address) {
        this.member_address = member_address;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public Date getMember_DOB() {
        return member_DOB;
    }

    public void setMember_DOB(Date member_DOB) {
        this.member_DOB = member_DOB;
    }

    public int getMember_gender() {
        return member_gender;
    }

    public void setMember_gender(int member_gender) {
        this.member_gender = member_gender;
    }

    public member() {
    }

    public member(int member_id, String member_email, String member_name, String member_address, String member_phone, Date member_DOB, int member_gender) {
        this.member_id = member_id;
        this.member_email = member_email;
        this.member_name = member_name;
        this.member_address = member_address;
        this.member_phone = member_phone;
        this.member_DOB = member_DOB;
        this.member_gender = member_gender;
    }

    public int checkEmail(String email){
        int check = -1;
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher match = pattern.matcher(email);
        if(match.matches()){
            check = 1;
        }
        return check;
    }
}
