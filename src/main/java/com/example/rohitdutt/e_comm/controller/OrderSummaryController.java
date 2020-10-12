package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.OrderDetails;
import com.example.rohitdutt.e_comm.data.entity.OrderSummary;
import com.example.rohitdutt.e_comm.data.repository.OrderDetailsRepository;
import com.example.rohitdutt.e_comm.data.repository.OrderSummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class OrderSummaryController {

        @Autowired
        private OrderSummaryRepository orderSummaryRepository;

        @GetMapping("/order-summary-all")
        public List<OrderSummary> getOrderSummaries(){
            return this.orderSummaryRepository.findAll();
        }

        @GetMapping("order-summary-id/{orderSummaryId}")
        public Optional<OrderSummary> getOrderSummaryById(@PathVariable String orderSummaryId){
            return this.orderSummaryRepository.findById(orderSummaryId);
        }

        @PostMapping("order-summary-create")
        public OrderSummary createOrderSummary(@Valid @RequestBody OrderSummary orderSummary){
            return orderSummaryRepository.save(orderSummary);
        }
}
