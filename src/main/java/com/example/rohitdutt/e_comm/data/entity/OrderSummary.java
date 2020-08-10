package com.example.rohitdutt.e_comm.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="order_summary")
public class OrderSummary implements Serializable {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "amount")
    private float amount;

    @Column(name = "actual_amount")
    private float actualAmount;

    @Column(name = "profit_amount")
    private float profitAmount;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "payment_mode")
    private String paymentMode;

    @Column(name = "payment_status")
    private String paymentStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_id")
    private List<OrderDetails> orderDetails;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public OrderSummary() {
        super();
    }

    public OrderSummary(String orderId, Customer customer, Date orderDate, float amount, float actualAmount, float profitAmount, String shippingAddress, String contactNumber, String orderStatus, String pincode, String paymentMode, String paymentStatus, List<OrderDetails> orderDetails) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
        this.amount = amount;
        this.actualAmount = actualAmount;
        this.profitAmount = profitAmount;
        this.shippingAddress = shippingAddress;
        this.contactNumber = contactNumber;
        this.orderStatus = orderStatus;
        this.pincode = pincode;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.orderDetails = orderDetails;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public float getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(float actualAmount) {
        this.actualAmount = actualAmount;
    }

    public float getProfitAmount() {
        return profitAmount;
    }

    public void setProfitAmount(float profitAmount) {
        this.profitAmount = profitAmount;
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
