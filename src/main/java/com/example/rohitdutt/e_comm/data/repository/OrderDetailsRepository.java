package com.example.rohitdutt.e_comm.data.repository;
import com.example.rohitdutt.e_comm.data.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,String> {
}
