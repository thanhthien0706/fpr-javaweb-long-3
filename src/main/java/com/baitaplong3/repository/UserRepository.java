package com.baitaplong3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baitaplong3.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findOneByUsername(String username);

	UserEntity findOneByEmail(String email);

	UserEntity findOneById(Long id);
}
