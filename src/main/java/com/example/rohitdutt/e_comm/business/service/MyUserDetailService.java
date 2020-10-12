package com.example.rohitdutt.e_comm.business.service;

import com.example.rohitdutt.e_comm.data.UserPrincipal;
import com.example.rohitdutt.e_comm.data.entity.User;
import com.example.rohitdutt.e_comm.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user==null)
            throw new UsernameNotFoundException("User 404+");
        return new UserPrincipal(user);
    }
}
