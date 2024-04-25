package com.oops.hotel;

public class Donate {
	public void donate(String donorId,String bloodType)
	{
		System.out.println("Donor ID:"+donorId+"\n"+"Blood Type:"+bloodType+"ve");
	}
	public void donate(int quantity)
	{
		System.out.println("Quantity Of Blood Donated:"+quantity+"unit");
		System.out.println("              ----------Thanks For Donating Blood----------");
	}
	public void donate(String donorName,String bloodType,int quantity)
	{
		System.out.println("Donor name:"+donorName+"\n"+"Blood Type:"+bloodType+"ve");
		System.out.println("Quantity Of Blood Donated:"+quantity+"unit");
		System.out.println("              ---------Thanks For Donating Blood----------");
	}
	public void bloodReceived(String recipientName,String bloodGroup,int quantityReceived)
	{
		int cost=quantityReceived*500;
		System.out.println("Recipient name:"+recipientName);
	    System.out.println("quantity Of Blood Received:"+quantityReceived+"unit"+ "\n" +"cost:"+cost+"Rs");
	}
 
}
