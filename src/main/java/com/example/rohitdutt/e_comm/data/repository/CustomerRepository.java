package com.example.rohitdutt.e_comm.data.repository;

import com.example.rohitdutt.e_comm.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String> {

}
