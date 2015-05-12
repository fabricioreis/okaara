package com.okaara.repository.user;

import java.util.List;

import com.okaara.shared.client.model.User;

public interface UserRepository {

	User get(int id);

	void save(User user);
	
	List<User> findAll();
}
