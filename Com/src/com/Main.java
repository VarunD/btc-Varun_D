package com;

public class Main {

	public static void main(String[] args) 
	{
		Address a = new Address("siddeshwar nagar", "Shivamogga");
		Address a1 = new Address("siddeshwar nagar", "Shivamogga");
		System.out.println(a.equals(a1));
		
		Customer c = new Customer(1, "varun", "abc@gmail.com", a);
		Customer c1 = new Customer(1, "varun", "abc@gmail.com", a);
		System.out.println(c==c1);
	}

}
