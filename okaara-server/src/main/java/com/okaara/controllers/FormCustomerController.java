package com.okaara.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.okaara.business.CustomerBusiness;
import com.okaara.shared.client.model.Customer;

@Controller
@RequestMapping("/formCustomer")
public class FormCustomerController {

	@Autowired
	private CustomerBusiness customerBs;

	@ResponseBody
	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	public Customer get(@PathVariable("id") String id) {
		return customerBs.get(Integer.parseInt(id));
	}
}
