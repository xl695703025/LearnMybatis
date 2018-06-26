package com.yuxia.mapper;

import java.util.List;

import com.yuxia.entity.User;

public interface UserMapper {

	public User selectUser(int id);
	public List<User> selectAll();
}
