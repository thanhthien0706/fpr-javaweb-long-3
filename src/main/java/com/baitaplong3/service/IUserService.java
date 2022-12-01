package com.baitaplong3.service;

import com.baitaplong3.entity.UserEntity;

public interface IUserService {
	UserEntity findOneById(Long id);
}
