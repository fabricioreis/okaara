package com.okaara.repository.customer;

import org.springframework.stereotype.Repository;

import com.okaara.framework.repository.Dao;
import com.okaara.framework.repository.Model;
import com.okaara.shared.client.model.Customer;

@Repository
class CustomerRepositoryImpl extends Dao implements CustomerRepository {

	@Override
	public Customer get(int id) {
		return findOne("consulta-cliente.sql", Model.create().add("id", id), new CustomerMapper());
	}

	@Override
	public void save(Customer customer) {
		update("inclusao-cliente.sql", customer);
	}

}
