package com.baitaplong3.service;

import java.util.List;

import com.baitaplong3.dto.ContentDTO;
import com.baitaplong3.form.CreateContentForm;

public interface IContentService {
	boolean createContent(Long id, CreateContentForm createContentForm);

	List<ContentDTO> findAllContent();
}
