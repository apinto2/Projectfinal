package com.finalproject.CIS.Models;
import javax.persistence.*;

import java.util.UUID;
@Entity
@Table(name = "transaction")
public class transaction {
    @Id
    @Column(name = "transactionid")
    private String transactionid;
    @Column(name = "productid")
    private String productid;
    @Column(name = "employeeid")
    private String employeeid;
    @Column(name = "customerid")
    private String customerid;
    @Column(name = "date")
    private String date;
    @Column(name = "receipt")
    private int receipt;



    public transaction() {

    }

    public transaction(String transactionid, String productid, String employeeid, String customerid, String date, int receipt) {
        this.transactionid = transactionid;
        this.productid = productid;
        this.employeeid = employeeid;
        this.customerid = customerid;
        this.date = date;
        this.receipt = receipt;

        this.date = date;

    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }


    public String getdate() {
        return date;
    }

    public void setdate(String date) {
        this.date = date;
    }

    public int getreceipt() {
        return receipt;
    }

    public void setreceipt(int receipt) {
        this.receipt = receipt;
    }

}