package com.okaara.repository.customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.okaara.shared.client.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	private static final String ID = "idcliente";
	private static final String NAME = "nome";

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Customer(rs.getInt(ID), rs.getString(NAME));
	}

}
