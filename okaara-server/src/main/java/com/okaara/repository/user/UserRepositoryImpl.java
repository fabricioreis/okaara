package com.okaara.repository.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.okaara.framework.repository.Dao;
import com.okaara.framework.repository.Model;
import com.okaara.shared.client.model.User;

@Repository
class UserRepositoryImpl extends Dao implements UserRepository {

	@Override
	public User get(int id) {
		return findOne("consulta-usuario.sql", Model.create().add("id", id), new UserMapper());
	}

	@Override
	public void save(User user) {
		update("inclusao-usuario.sql", user);
	}

	@Override
	public List<User> findAll() {
		return findAll("lista-usuarios.sql", new UserMapper());
	}

}
