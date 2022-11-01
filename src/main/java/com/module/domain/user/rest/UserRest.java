package com.module.domain.user.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/user")
public interface UserRest {

    @GetMapping()
    void user();

}
