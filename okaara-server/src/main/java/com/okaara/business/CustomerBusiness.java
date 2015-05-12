package com.okaara.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okaara.repository.customer.CustomerRepository;
import com.okaara.shared.client.model.Customer;

@Service
public class CustomerBusiness {

	private @Autowired CustomerRepository repository;

	public Customer get(int id) {
		return repository.get(id);
	}

}
