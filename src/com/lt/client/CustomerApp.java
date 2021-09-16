package com.lt.client;

import com.lt.bean.Customer;
import com.lt.bussiness.CustomerImpl;
import com.lt.bussiness.CustomerInterface;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		CustomerInterface customerInterface = new CustomerImpl();
		
		System.out.println(customerInterface.createCustome());
		System.out.println(customerInterface.listCustomer());
		System.out.println(customerInterface.updateCustomer(customer));
		System.out.println(customerInterface.listCustomer());
		System.out.println(customerInterface.deleteCustomer(101));
//		System.out.println(customerInterface.listCustomer());
		
		

	}

}
