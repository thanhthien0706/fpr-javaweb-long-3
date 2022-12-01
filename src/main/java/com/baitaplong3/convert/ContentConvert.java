package com.baitaplong3.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.baitaplong3.dto.ContentDTO;
import com.baitaplong3.entity.ContentEntity;

@Component
public class ContentConvert {

	@Autowired
	UserConvert userConvert;

	public ContentDTO toDto(ContentEntity contentEntity) {
		ContentDTO dto = new ContentDTO();
		dto.setId(contentEntity.getId());
		dto.setTitle(contentEntity.getTitle());
		dto.setBrief(contentEntity.getBrief());
		dto.setContent(contentEntity.getContent());
		dto.setSort(contentEntity.getSort());
		dto.setCreatedTime(contentEntity.getCreatedTime());
		dto.setUpdatedTime(contentEntity.getUpdatedTime());
		dto.setAuthor(userConvert.toDto(contentEntity.getAuthorId()));

		return dto;
	}

	public List<ContentDTO> toListDto(List<ContentEntity> entitys) {
		List<ContentDTO> dtos = new ArrayList<>();

		for (ContentEntity content : entitys) {
			dtos.add(toDto(content));
		}

		return dtos;
	}
}
