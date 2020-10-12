package com.example.rohitdutt.e_comm.data.repository;

import com.example.rohitdutt.e_comm.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
