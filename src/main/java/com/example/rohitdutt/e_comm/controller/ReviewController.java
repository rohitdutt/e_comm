package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.Customer;
import com.example.rohitdutt.e_comm.data.entity.Review;
import com.example.rohitdutt.e_comm.data.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ReviewController {
        @Autowired
        private ReviewRepository reviewRepository;

        @GetMapping("/review-all")
        public List<Review> getReviewss(){
            return this.reviewRepository.findAll();
        }

        @GetMapping("review-id/{reviewId}")
        public Optional<Review> getReviewById(@PathVariable String reviewId){
            return this.reviewRepository.findById(reviewId);
        }

        @PostMapping("review-create")
        public Review createReview(@Valid @RequestBody Review review){
            return reviewRepository.save(review);
        }
    }

