package com.baitaplong3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.baitaplong3.dto.MyUser;
import com.baitaplong3.entity.UserEntity;
import com.baitaplong3.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findOneByUsername(username);

		if (userEntity == null) {
			throw new UsernameNotFoundException("User not found");
		}

		List<GrantedAuthority> authorities = new ArrayList();
		authorities.add(new SimpleGrantedAuthority(userEntity.getRole().getName()));

		MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(), true, true, true, true,
				authorities);

		myUser.setId(userEntity.getId());
		myUser.setEmail(userEntity.getEmail());
		myUser.setProfile(userEntity.getProfile());

		return myUser;
	}

}
