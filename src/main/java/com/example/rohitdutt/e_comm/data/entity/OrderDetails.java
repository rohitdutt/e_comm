package com.example.rohitdutt.e_comm.data.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="order_details")
public class OrderDetails implements Serializable {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "amount")
    private float amount;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "order_date")
    private Date OrderDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderDetails() {
        super();
    }

    public OrderDetails(String transactionId, String orderId, String itemName, float amount, int quantity, Date orderDate, Product product) {
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.itemName = itemName;
        this.amount = amount;
        this.quantity = quantity;
        OrderDate = orderDate;
        this.product = product;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
