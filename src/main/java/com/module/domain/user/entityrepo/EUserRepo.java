package com.module.domain.user.entityrepo;

import com.module.domain.user.entity.TbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface EUserRepo extends JpaRepository<TbUser, Long> {

}
