package com.lt.bussiness;

import com.lt.bean.Customer;

public interface CustomerInterface {
	
	public String createCustome();
	
	public String deleteCustomer(int customerId);
	
	public String listCustomer();
	
	public String updateCustomer(Customer customer);

}
