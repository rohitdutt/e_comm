package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.OrderDetails;
import com.example.rohitdutt.e_comm.data.entity.Product;
import com.example.rohitdutt.e_comm.data.repository.OrderDetailsRepository;
import com.example.rohitdutt.e_comm.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class OrderDetailsController {

        @Autowired
        private OrderDetailsRepository orderDetailsRepository;

        @GetMapping("/order-detail-all")
        public List<OrderDetails> getOrderDetails(){
            return this.orderDetailsRepository.findAll();
        }

        @GetMapping("order-detail-id/{orderDetailsId}")
        public Optional<OrderDetails> getOrderDetailsById(@PathVariable String orderDetailsId){
            return this.orderDetailsRepository.findById(orderDetailsId);
        }

        @PostMapping("order-detail-create")
        public OrderDetails createOrderDetails(@Valid @RequestBody OrderDetails orderDetails){
            return orderDetailsRepository.save(orderDetails);
        }
}
