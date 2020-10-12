package com.example.rohitdutt.e_comm.data.repository;

import com.example.rohitdutt.e_comm.data.entity.OrderSummary;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSummaryRepository extends JpaRepository<OrderSummary,String> {
}
