package com.oops.hotel;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		BankDetails bank = new BankDetails();
		Bank a=new Bank();

		long accountNo, phoneNumber;
		int deposit;
		String userName, IFSC;
		String wordcheck="^[a-zA-Z]+$";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
		userName = sc.next();
		while(!userName.matches(wordcheck))
		{
			System.out.println("Enter valid username:");
			userName = sc.next();
		}
		System.out.println("Enter deposit amount:");
		deposit = sc.nextInt();
		while(deposit<0)
		{
			System.out.println("Enter positive value");
			deposit = sc.nextInt();
		}
		Random rand=new Random();
		System.out.println("Enter Account number:");
		accountNo = sc.nextLong();
		while(accountNo<0)
		{
			System.out.println("Enter positive value");
			accountNo = sc.nextLong();
		}
		String IFSCcheck="^[a-zA-z1-6]+$";
		System.out.println("Enter IFSCCODE:");
		IFSC = sc.next();
		while(!IFSC.matches(IFSCcheck))
		{
			System.out.println("Enter IFSCCODE:");
			IFSC = sc.next();
		}
		String phoneNumberCheck="^[0-6]+$";
		System.out.println("Enter phonenumber:");
		phoneNumber = sc.nextLong();
		while(phoneNumber<0)
		{
			System.out.println("Enter positive value");
			phoneNumber = sc.nextLong();
		}
		bank.setAccountNo(accountNo);
		bank.setPhoneNumber(phoneNumber);
		bank.setDeposit(deposit);
		bank.setUserName(userName);
		bank. setIFSC(IFSC);
		a.deposit(bank.getUserName(),bank.getAccountNo(),bank.getDeposit());
		a.deposit(bank.getUserName(),bank. getIFSC(),bank.getDeposit());
		a.deposit(bank.getUserName(), bank.getDeposit(),bank.getPhoneNumber());

	}

}
