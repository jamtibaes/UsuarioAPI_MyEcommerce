package com.letscode.ecommerce.userapi.repository;

import com.letscode.ecommerce.userapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
