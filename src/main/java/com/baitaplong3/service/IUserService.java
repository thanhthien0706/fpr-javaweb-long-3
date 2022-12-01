package com.baitaplong3.service;

import com.baitaplong3.dto.UserDTO;
import com.baitaplong3.entity.UserEntity;
import com.baitaplong3.form.RegisterForm;
import com.baitaplong3.form.UserEditForm;

public interface IUserService {
	UserEntity findOneById(Long id);

	UserDTO findOneByIdDto(Long id);

	UserDTO register(RegisterForm registerForm);

	UserDTO userUpdate(Long id, UserEditForm userEditForm);
}
