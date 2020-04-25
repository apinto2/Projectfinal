package com.finalproject.CIS.Models;
import javax.persistence.*;
import java.util.UUID;


@Entity
@Table(name = "customer")
public class customer {
    @Id
    @Column(name = "customerid")
    private String customerid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;

    public customer(){

    }
    public customer(String firstname, String lastname, String customerid){
        this.firstname = firstname;
        this.lastname = lastname;
        this.customerid = customerid;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname=lastname;
    }
    public String getCustomerID(){
        return customerid;
    }

    public void setCustomerID(String id){
        this.customerid = id;
    }
}
