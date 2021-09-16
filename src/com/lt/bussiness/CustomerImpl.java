package com.lt.bussiness;

import java.util.Scanner;

import com.lt.bean.Customer;

public class CustomerImpl implements CustomerInterface {

	Customer customers[] = new Customer[3];

	@Override
	public String createCustome() {

		//Adding first Customer
		customers[0] = new Customer();
		customers[0].setCustomerId(101);
		customers[0].setCustomerName("Tushar");
		customers[0].setCustomerAddress("Hydrabad");

		//Adding second Customer
		customers[1] = new Customer();
		customers[1].setCustomerId(102);
		customers[1].setCustomerName("Saket");
		customers[1].setCustomerAddress("Bangalore");

		//Adding Third Customer
		customers[2] = new Customer();
		customers[2].setCustomerId(103);
		customers[2].setCustomerName("Kunal");
		customers[2].setCustomerAddress("Patna");

		return "Customer Created";
	}

	@Override
	public String listCustomer() {
		System.out.println("<-----Print Customer Details----->");
		if(customers !=null) {
			// List Customer Logic
			for(Customer  cust : customers){
				System.out.println("details of Customer--> " +cust.getCustomerId() + " " +cust.getCustomerName()+ " " +cust.getCustomerAddress());
			}
		}
		return "Customer List Printed";
	}

	@Override
	public String deleteCustomer(int customerId) {
		System.out.println("<-- deleting  Customer--> ");
		int index =-1;
		Customer customer[]=new Customer[customers.length-1];
		
		for(int i=0;i<customers.length;i++) {
			if(customers[i].getCustomerId() == customerId) {
				index = i;
			}
		}

		for (int i = 0; i < customers.length-1; i++) {
			if(i<index)
				customer[i]=customers[i];
			else
				customer[i]=customers[i+1];
		}

		for(Customer  cust : customer){
			System.out.println("details of Customer--> " +cust.getCustomerId() + " " +cust.getCustomerName()+ " " +cust.getCustomerAddress());
		}
		return "Customer "+customerId+ " Delete Successfully... ";

	}

	@Override
	public String updateCustomer(Customer customer) {

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter customerId to be updated : ");
        int element = sc.nextInt();   //101
       
        for(Customer cust: customers)
        {
            if(cust.getCustomerId()==element)
            {
                cust.setCustomerName("Gaurav");
                cust.setCustomerAddress("Khagaria");
            }
        }
       
        return " customer updated successfully";
	}

}
