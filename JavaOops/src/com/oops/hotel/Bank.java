package com.oops.hotel;

public class Bank {
	public void deposit(String userName,long accountNo,int deposit)
	{
		System.out.println("username:"+userName+" acccountnumber:"+accountNo+" amountdeposited:"+ deposit);
	}
	public void deposit(String userName,String IFSC,int deposit)
	{
		System.out.println("username:"+userName+" IFScCode:"+IFSC+" amountdeposited:"+deposit);
	}
	public void deposit(String userName,int deposit,long phoneNumber)
	{
		System.out.println("username:"+userName+" phonenumber:"+phoneNumber+" amountdeposited:"+deposit);
	}
}