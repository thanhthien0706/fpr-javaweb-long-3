package com.baitaplong3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baitaplong3.entity.UserEntity;
import com.baitaplong3.repository.UserRepository;
import com.baitaplong3.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserEntity findOneById(Long id) {
		return userRepository.findOneById(id);
	}

}
