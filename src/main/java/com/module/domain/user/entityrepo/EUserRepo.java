package com.module.domain.user.entityrepo;

import com.module.domain.user.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Component
public interface EUserRepo extends JpaRepository<TbUser, Long> {

    Optional<TbUser> findByEmail(String email);

    Optional<TbUser> findByUserId(Long userId);
}
