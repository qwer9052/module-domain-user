package com.module.domain.user.entity;


import com.module.db.base.BaseEntity;
import com.module.domain.user.model.TbUserDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "TbUserBuilder")
public class TbUser extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String pwd, email, name;

}
