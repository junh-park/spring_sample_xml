package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.spring_sample.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Jun");
		customer.setLastname("Park");
		
		customers.add(customer);
		
		return customers;
	}
}
