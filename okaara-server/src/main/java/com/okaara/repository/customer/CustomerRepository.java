package com.okaara.repository.customer;

import com.okaara.shared.client.model.Customer;

public interface CustomerRepository {

	Customer get(int id);
	
	void save(Customer customer);

}
