package com.module.domain.user.repo;

import com.module.core.exception.CommonException;
import com.module.db.user.entity.TbUser;
import com.module.domain.user.entityrepo.EUserRepo;
import com.module.db.user.model.TbUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepo {
    @Autowired
    EUserRepo eUserRepo;

//    public Optional<TbUser> findById(Long userId) {
//        return eUserRepo.findById(userId);
//    }

    public TbUser findById(Long userId) {
        return eUserRepo.findById(userId).orElseThrow(()->new CommonException("존재 하지 않는 유저 입니다."));
    }

    public TbUser saveUser(TbUserDto tbUserDto) {
        return eUserRepo.save(TbUser.TbUserBuilder()
                .email(tbUserDto.getEmail())
                .name(tbUserDto.getName())
                .pwd(tbUserDto.getPwd()).build());
    }

    public Optional<TbUser> findByEmail(String email) {
        return eUserRepo.findByEmail(email);
    }


    public Optional<TbUser>  findByEmailAndPwd(String email, String pwd) {
        return eUserRepo.findByEmailAndPwd(email,pwd);
    }
}
