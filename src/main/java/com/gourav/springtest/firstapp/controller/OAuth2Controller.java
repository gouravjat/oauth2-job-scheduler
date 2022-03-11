package com.gourav.springtest.firstapp.controller;


import com.gourav.springtest.firstapp.service.OAuth2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuth2Controller {

    @GetMapping("/auth")
    public OAuth2Service authenticate(@RequestParam(value = "name", defaultValue = "This is a message") String name) {
        Integer id = 1;
        String content = "%s";
        return new OAuth2Service(1, String .format(content, name));
    }
}
