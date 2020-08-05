package com.example.rohitdutt.e_comm.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="review")
public class Review {

    @Id
    @Column(name = "review_id", nullable = false)
    private String reviewId;

    @Column(name = "product_id", nullable = false)
    private String productId;

    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Column(name = "date_of_review", nullable = false)
    private Date dateOfReview;

    @Column(name = "review", nullable = false)
    private String review;

    @Column(name = "rating", nullable = false)
    private int rating;

    public Review() {
        super();
    }

    public Review(String reviewId, String productId, String customerId, Date dateOfReview, String review, int rating) {
        this.reviewId = reviewId;
        this.productId = productId;
        this.customerId = customerId;
        this.dateOfReview = dateOfReview;
        this.review = review;
        this.rating = rating;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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
