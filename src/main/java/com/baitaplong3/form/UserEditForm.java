package com.baitaplong3.form;

import lombok.Data;

@Data
public class UserEditForm {
	private Long id;
	private String firstname;
	private String lastname;
	private String username;
	private String phone;
	private String description;
}
