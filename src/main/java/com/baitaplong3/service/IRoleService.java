package com.baitaplong3.service;

import com.baitaplong3.entity.RoleEntity;

public interface IRoleService {
	RoleEntity findOneByName(String name);
}
