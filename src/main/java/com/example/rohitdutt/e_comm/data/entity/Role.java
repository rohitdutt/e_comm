package com.example.rohitdutt.e_comm.data.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;


@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @Column(name = "role_id")
    private String roleId;

    @Column(name = "role")
    private String role;

    @Override
    public String getAuthority() {
        return role;
    }


}
