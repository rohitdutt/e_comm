package com.example.rohitdutt.e_comm.data.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
public class User{

    @Id
    @Column(name = "userId")
    private String userId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "roles", joinColumns = @JoinColumn(name = "userId", referencedColumnName = "userId"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
    private Collection<Role> roles;

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User(String userId, Customer customer, String userName, String password, List<Role> roles) {
        this.userId = userId;
        this.customer = customer;
        this.username = userName;
        this.password = password;
        this.roles = roles;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
