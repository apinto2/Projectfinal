package com.finalproject.CIS.Models;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="employee")
public class employee {
    @Id
    @Column(name="employeeid")
    private String employeeid;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
//    @Column(name = "isactive")
//    private boolean isActive;

    public employee(){

    }
    public employee(String employeeid, String firstname,String lastname){
        this.employeeid = employeeid;
        this.firstname = firstname;
        this.lastname = lastname;
//        this.isActive = isActive;
    }
    public String getEmployeeID(){
        return employeeid;
    }
    public void setEmployeeID(String employeeid){
        this.employeeid = employeeid;
    }
    public String getfirstname(){
        return firstname;
    }
    public void setfirstname(String firstName){
        this.firstname = firstName;
    }
    public String getlastname(){
        return lastname;
    }
    public void setlastname(String lastName){
        this.lastname = lastName;
    }
//    public boolean getIsActive(){
//        return isActive;
//    }
//    public void setIsActive(boolean isActive){
//        this.isActive = isActive;
//    }
}
