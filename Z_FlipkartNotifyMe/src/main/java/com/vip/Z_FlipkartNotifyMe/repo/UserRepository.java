package com.vip.Z_FlipkartNotifyMe.repo;

import com.vip.Z_FlipkartNotifyMe.model.SubscribersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<SubscribersEntity,Long> {

    List<SubscribersEntity> findByProductId(Long id);
}
