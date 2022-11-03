package com.module.domain.user.repo;

import com.module.core.util.StringUtil;
import com.module.domain.user.entity.TbUser;
import com.module.domain.user.entityrepo.EUserRepo;
import com.module.domain.user.model.TbUserDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
public class UserRepo {
    @Autowired
    EUserRepo eUserRepo;

    public Optional<TbUser> findByUserId(Long userId) {
        return eUserRepo.findByUserId(userId);
    }

    public TbUser saveUser(TbUserDto tbUserDto) {
        String encodedPw = StringUtil.getSHA256(tbUserDto.getPwd());
        return eUserRepo.save(TbUser.TbUserBuilder()
                .email(tbUserDto.getEmail())
                .name(tbUserDto.getName())
                .pwd(encodedPw).build());
    }

    public Optional<TbUser> findByEmail(String email) {
        return eUserRepo.findByEmail(email);
    }


}
