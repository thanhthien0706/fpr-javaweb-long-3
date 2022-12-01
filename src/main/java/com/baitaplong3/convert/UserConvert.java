package com.baitaplong3.convert;

import org.springframework.stereotype.Component;

import com.baitaplong3.dto.UserDTO;
import com.baitaplong3.entity.UserEntity;
import com.baitaplong3.form.RegisterForm;

@Component
public class UserConvert {

	public UserDTO toDto(UserEntity userEntity) {
		UserDTO dto = new UserDTO();
		dto.setId(userEntity.getId());
		dto.setFirstname(userEntity.getFirstname());
		dto.setLastname(userEntity.getLastname());
		dto.setUsername(userEntity.getUsername());
		dto.setPhone(userEntity.getPhone());
		dto.setEmail(userEntity.getEmail());
		dto.setDescription(userEntity.getDescription());
		dto.setRole_id(userEntity.getRole().getId());
		dto.setCreatedTime(userEntity.getCreatedTime());
		dto.setUpdatedTime(userEntity.getUpdatedTime());

		return dto;
	}
}
