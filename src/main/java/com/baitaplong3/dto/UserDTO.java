package com.baitaplong3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO extends AbstractSDTO {
	private String firstname;
	private String lastname;
	private String username;
	private String phone;
	private String email;
	private String description;
	private Long role_id;
}
