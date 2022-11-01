package com.module.domain.user.rest;

import com.module.domain.user.model.TbUserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/user")
public interface UserRest {

    @GetMapping()
    void user();

    @PostMapping()
    void createUser(TbUserDto tbUserDto);

}
