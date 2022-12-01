package com.baitaplong3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baitaplong3.entity.ContentEntity;

@Repository
public interface ContentRepository extends JpaRepository<ContentEntity, Long> {

}
