package com.codecool.september.secuirtyapp.api.rest.register;

import com.codecool.september.secuirtyapp.service.MyUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegisterController {

    private final MyUserDetailsService service;

    @PostMapping("/register")
    public void register(@RequestBody RegisterRequest request){
        service.register(request.getUsername(), request.getPassword());
    }
}
