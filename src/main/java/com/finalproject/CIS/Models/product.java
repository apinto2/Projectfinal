package com.finalproject.CIS.Models;
import javax.persistence.*;


import java.util.UUID;

@Entity
@Table(name = "product")
public class product {
    @Id
    @Column(name = "productid")
    private String productid;
    @Column(name = "product")
    private String product;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "cost")
    private double cost;


    public product(){

    }
    public product(String productid, String product,int quantity,double cost){
        this.productid = productid;
        this.product = product;
        this.quantity = quantity;
        this.cost=cost;
    }
    public String getProductID(){
        return productid;
    }
    public void setProductID(String productid){
        this.productid = productid;
    }
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product = product;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
