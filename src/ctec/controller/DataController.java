package ctec.controller;
import java.util.LinkedList;
import java.util.Queue;

import ctec.model.Customer;

public class DataController
{
	private Queue<Customer> customerQueue;
	private Customer baseCustomer;
	private Customer RandomCustomer;

	public DataController()
	{
		customerQueue =  new LinkedList<Customer>();
	}
	
	public void Start()
	{
		for(int i = 0; i < 10; i ++)
		{
		RandomCustomer = new Customer();
		customerQueue.add(RandomCustomer);
		System.out.print(RandomCustomer.getName());
		System.out.print(" ");
		System.out.print(RandomCustomer.getHasOrder());
		System.out.print(" ");
		System.out.print(RandomCustomer.getTotal());
		System.out.println("");
		}
		

	}
	
	
}
