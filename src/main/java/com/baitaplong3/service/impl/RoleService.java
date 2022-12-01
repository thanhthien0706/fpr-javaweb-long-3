package com.baitaplong3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baitaplong3.entity.RoleEntity;
import com.baitaplong3.repository.RoleRepository;
import com.baitaplong3.service.IRoleService;

@Service
public class RoleService implements IRoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public RoleEntity findOneByName(String name) {
		return roleRepository.findOneByName(name);
	}

}
