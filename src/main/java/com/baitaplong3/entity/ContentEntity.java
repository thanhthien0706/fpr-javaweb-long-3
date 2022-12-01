package com.baitaplong3.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_content")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentEntity extends AbstractEntity {
	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String brief;

	@Column(nullable = false)
	private String content;

	@Column
	private String sort;

	@ManyToOne
	@JoinColumn(name = "AuthorId")
	private UserEntity AuthorId;
}
