package com.example.rohitdutt.e_comm.controller;

import com.example.rohitdutt.e_comm.data.entity.Customer;
import com.example.rohitdutt.e_comm.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

        @Autowired
        private CustomerRepository customerRepository;

        @GetMapping("/customer-all")
        public Iterable<Customer> getCustomers(){
            return this.customerRepository.findAll();
        }

        @GetMapping("customer-id/{customerId}")
        public Optional<Customer> getCustomerById(@PathVariable String customerId){
            return this.customerRepository.findById(customerId);
        }

        @PostMapping("customer-create")
        public Customer createCustomer(@Valid @RequestBody Customer customer){
            return customerRepository.save(customer);
        }
    }

