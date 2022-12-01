package com.baitaplong3.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baitaplong3.convert.ContentConvert;
import com.baitaplong3.dto.ContentDTO;
import com.baitaplong3.entity.ContentEntity;
import com.baitaplong3.form.CreateContentForm;
import com.baitaplong3.repository.ContentRepository;
import com.baitaplong3.service.IContentService;

@Service
public class ContentService implements IContentService {

	@Autowired
	ContentRepository contentRepository;

	@Autowired
	UserService userService;

	@Autowired
	ContentConvert contentConvert;

	@Override
	public boolean createContent(Long id, CreateContentForm createContentForm) {
		ContentEntity entity = new ContentEntity();
		entity.setTitle(createContentForm.getTitle());
		entity.setBrief(createContentForm.getBrief());
		entity.setContent(createContentForm.getContent());
		entity.setAuthorId(userService.findOneById(id));
		entity.setCreatedTime(new Date());
		entity.setUpdatedTime(new Date());

		entity = contentRepository.save(entity);

		if (entity == null) {
			return false;
		}

		return true;
	}

	@Override
	public List<ContentDTO> findAllContent() {
		List<ContentEntity> contents = contentRepository.findAll();

		return contentConvert.toListDto(contents);
	}

}
