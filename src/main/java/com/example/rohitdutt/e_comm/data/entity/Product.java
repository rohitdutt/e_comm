package com.example.rohitdutt.e_comm.data.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="products")
public class Product implements Serializable {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "price_per_unit")
    private float pricePerUnit;

    @Column(name = "sell_price")
    private float sellPrice;

    @Column(name = "profit_per_unit")
    private float profitPerUnit;

    @Column(name = "available_unit")
    private int availableUnit;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "review_id")
    private List<Review> reviews;

    public Product() {
        super();
    }

    public Product(String productId, String itemName, String barcode, float pricePerUnit, float sellPrice, float profitPerUnit, int availableUnit, List<Review> reviews) {
        this.productId = productId;
        this.itemName = itemName;
        this.barcode = barcode;
        this.pricePerUnit = pricePerUnit;
        this.sellPrice = sellPrice;
        this.profitPerUnit = profitPerUnit;
        this.availableUnit = availableUnit;
        this.reviews = reviews;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getAvailableUnit() {
        return availableUnit;
    }

    public void setAvailableUnit(int availableUnit) {
        this.availableUnit = availableUnit;
    }

    public List<Review> getReviews() {
        return reviews;
    }


    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public float getProfitPerUnit() {
        return profitPerUnit;
    }

    public void setProfitPerUnit(float profitPerUnit) {
        this.profitPerUnit = profitPerUnit;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", barcode='" + barcode + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", availableUnit=" + availableUnit +
                ", reviews=" + reviews +
                '}';
    }

}
