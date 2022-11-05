package com.module.domain.user.rest;

import com.module.core.annotation.JwtAuth;
import com.module.core.annotation.LogExecutionTime;
import com.module.core.jwt.JwtDto;
import com.module.db.user.model.TbUserDto;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/user")
public interface UserRest  {

    @PostMapping("/login")
    JwtDto emailLogin(TbUserDto userDto);

    @GetMapping("/jwt/login")
    @JwtAuth
    JwtDto jwtLogin(Long userId);

    @PostMapping
    @LogExecutionTime
    JwtDto signup(@RequestBody TbUserDto tbUserDto) throws Exception;

    @GetMapping
    @JwtAuth
    TbUserDto findUser(Long userId);

}
