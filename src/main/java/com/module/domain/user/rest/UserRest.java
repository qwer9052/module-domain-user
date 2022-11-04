package com.module.domain.user.rest;

import com.module.core.annotation.JwtAuth;
import com.module.core.annotation.LogExecutionTime;
import com.module.core.jwt.JwtDto;
import com.module.domain.user.model.TbUserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
