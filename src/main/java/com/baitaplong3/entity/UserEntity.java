package com.baitaplong3.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "tbl_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends AbstractEntity {

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column
	private String salt;

	@Column(nullable = false)
	private String email;

	@Column
	private String profile;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private RoleEntity role;
}
