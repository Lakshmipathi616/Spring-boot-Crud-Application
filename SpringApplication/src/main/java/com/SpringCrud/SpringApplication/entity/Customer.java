package com.SpringCrud.SpringApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Table(name="customer")
public class Customer {
@Id
@Column(name= " customer_id ,lenght =50")
@GeneratedValue
    private int customerid;
    private String customername;
    private String customeraddress;
    private int mobile;

    public Customer(int customerid, String customername,int mobile){
        this.customerid =customerid;
        this.customername=customername;
        this.customeraddress= customeraddress;
        this.mobile=mobile;
    }
    public int getCustomerid() {
        return customerid;
    }
    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    // Getter and setter for customername
    public String getCustomername() {
        return customername;
    }
    public void setCustomername(String customername) {
        this.customername = customername;
    }

    // Getter and setter for customeraddress
    public String getCustomeraddress() {
        return customeraddress;
    }
    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    // Getter and setter for mobile
    public int getMobile() {
        return mobile;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String toString() {
        return "Customer{" +
                "customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", customeraddress='" + customeraddress + '\'' +
                ", mobile=" + mobile +
                '}';

    }

}







