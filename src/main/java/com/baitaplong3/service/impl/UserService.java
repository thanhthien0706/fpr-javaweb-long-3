package com.baitaplong3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baitaplong3.convert.UserConvert;
import com.baitaplong3.dto.UserDTO;
import com.baitaplong3.entity.RoleEntity;
import com.baitaplong3.entity.UserEntity;
import com.baitaplong3.form.RegisterForm;
import com.baitaplong3.form.UserEditForm;
import com.baitaplong3.repository.RoleRepository;
import com.baitaplong3.repository.UserRepository;
import com.baitaplong3.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	UserConvert userConvert;

	@Override
	public UserEntity findOneById(Long id) {
		return userRepository.findOneById(id);
	}

	@Override
	public UserDTO findOneByIdDto(Long id) {
		UserEntity user = userRepository.findOneById(id);
		UserDTO dto = userConvert.toDto(user);
		return dto;
	}

	@Override
	public UserDTO register(RegisterForm registerForm) {
		UserEntity user = new UserEntity();

		user.setUsername(registerForm.getUsername());
		user.setPassword(registerForm.getPassword());
		user.setEmail(registerForm.getEmail());
		user.setRole(roleRepository.findOneByName(RoleEntity.AUTHOR_ADMIN));

		user = userRepository.save(user);

		if (user == null) {
			return null;
		}

		UserDTO dto = userConvert.toDto(user);

		return dto;
	}

	@Override
	public UserDTO userUpdate(Long id, UserEditForm userEditForm) {
		UserEntity user = userRepository.findOneById(id);

		user.setUsername(userEditForm.getUsername());
		user.setFirstname(userEditForm.getFirstname());
		user.setLastname(userEditForm.getLastname());
		user.setPhone(userEditForm.getPhone());
		user.setDescription(userEditForm.getDescription());

		user = userRepository.save(user);

		if (user == null) {
			return null;
		}

		UserDTO dto = userConvert.toDto(user);

		return dto;
	}

}
