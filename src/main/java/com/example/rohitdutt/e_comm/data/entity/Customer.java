package com.example.rohitdutt.e_comm.data.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer{
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private String customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobileNo;

    @Column(name = "city")
    private String city;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "country")
    private String country;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "date")
    private Date date;

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<OrderSummary> orderSummaries;


    public Customer() {
        super();
    }

    public Customer(String customerId, String name, String email, String mobileNo, String city, String pincode, String country, String shippingAddress, Date date) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
        this.shippingAddress = shippingAddress;
        this.date = date;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String  customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShippingAdress() {
        return shippingAddress;
    }

    public void setShippingAdress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
