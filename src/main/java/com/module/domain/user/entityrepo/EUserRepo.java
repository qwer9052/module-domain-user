package com.module.domain.user.entityrepo;

import com.module.db.entity.user.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface EUserRepo extends JpaRepository<TbUser, Long> {

    Optional<TbUser> findByEmail(String email);

    Optional<TbUser> findById(Long userId);

    Optional<TbUser> findByEmailAndPwd(String email, String pwd);
}
