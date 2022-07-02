package com.codecool.september.secuirtyapp.service;

import com.codecool.september.secuirtyapp.model.MyUser;
import com.codecool.september.secuirtyapp.repository.MyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final MyUserRepository repository;
    private final PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username);
    }

    public void register(String username, String password){
        MyUser myUser = new MyUser();
        myUser.setUsername(username);
        myUser.setPassword(encoder.encode(password));

        //wysłąć maila

        repository.save(myUser);
    }
}
