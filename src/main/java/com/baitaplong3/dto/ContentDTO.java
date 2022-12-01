package com.baitaplong3.dto;

import lombok.Data;

@Data
public class ContentDTO extends AbstractSDTO {
	private String title;
	private String brief;
	private String content;
	private String sort;
	private UserDTO author;
}
