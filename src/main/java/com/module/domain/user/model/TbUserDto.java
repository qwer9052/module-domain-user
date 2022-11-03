package com.module.domain.user.model;

import lombok.Data;

@Data
public class TbUserDto {

    private Long userId;

    private String pwd, email, name;
}
