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
public class employee_list {
    private int employee_id;
    private String fullname;
    private int gender;
    private int salary;
    private String position;
    private String username;
    private String pass;
    private Date DOB;
    private String Email;
    private String Phone;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public employee_list() {
    }

    public employee_list(int employee_id, String fullname, int gender, int salary, String position, String username, String pass, Date DOB, String Email, String Phone) {
        this.employee_id = employee_id;
        this.fullname = fullname;
        this.gender = gender;
        this.salary = salary;
        this.position = position;
        this.username = username;
        this.pass = pass;
        this.DOB = DOB;
        this.Email = Email;
        this.Phone = Phone;
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

    public int checkPhone(String phone){
        int check = -1;
        Pattern pattern = Pattern.compile("(0|0+[0-9]{1})+([0-9]{9})\\b");
        Matcher match = pattern.matcher(phone);
        if(match.matches()){          
            check = 1;
        }
        return check;
    }
    
    public int checkEmpty(String input){
        int check = -1;
        if(input.isEmpty() || input.isBlank()){          
            check = 1;
        }
        return check;
    }
    
    public int checkPass(String pass){
        int check = -1;
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,32}$");
        Matcher match = pattern.matcher(pass);
        if(match.matches()){          
            check = 1;
        }
        return check;
    }
}
