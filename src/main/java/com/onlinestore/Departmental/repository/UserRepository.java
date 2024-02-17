package com.onlinestore.Departmental.repository;

import com.onlinestore.Departmental.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // You can add custom query methods here if needed
}
