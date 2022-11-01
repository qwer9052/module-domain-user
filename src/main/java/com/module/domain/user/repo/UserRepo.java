package com.module.domain.user.repo;

import com.module.domain.user.entity.TbUser;
import com.module.domain.user.entityrepo.EUserRepo;
import com.module.domain.user.model.TbUserDto;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserRepo {
    @Autowired
    EUserRepo eUserRepo;

    public void user() {
        System.out.println("userRepo");
        TbUser dto = TbUser.TbUserBuilder().userId(1L).address("asd").build();

        eUserRepo.save(dto);
    }
}
