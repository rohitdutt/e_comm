package com.example.rohitdutt.e_comm.data.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="review")
public class Review{

    @Id
    @Column(name = "review_id")
    private String reviewId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "date_of_review")
    private Date dateOfReview;

    @Column(name = "review")
    private String review;

    @Column(name = "rating")
    private int rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;


    public Review() {
    }

    public Review(String reviewId, String customerId, Date dateOfReview, String review, int rating, Product product) {
        this.reviewId = reviewId;
        this.customerId = customerId;
        this.dateOfReview = dateOfReview;
        this.review = review;
        this.rating = rating;
        this.product=product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(Date dateOfReview) {
        this.dateOfReview = dateOfReview;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
