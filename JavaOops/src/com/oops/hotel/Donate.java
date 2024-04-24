package com.oops.hotel;

public class Donate {
	public void donate(String donorName,String bloodType)
	{
		System.out.println("Donor Name:"+donorName+"\n"+"Blood Type:"+bloodType+"ve");
	}
	public void donate(int quantity)
	{
		System.out.println("Quantity Of Blood Donated:"+quantity+"unit");
		System.out.println("-------Donated successfully--------");
	}
	public void bloodReceived(String recipientName,String bloodGroup,int quantityReceived)
	{
		int cost=quantityReceived*500;
		System.out.println("Recipient name:"+recipientName);
	    System.out.println("quantity Of Blood Received:"+quantityReceived+"unit"+ "\n" +"cost:"+cost+"Rs");
	}
 
}
