package com.oops.hotel;
import java.util.*;
public class BloodBankAdmin {
	public void admin()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter admin name:");
		String adminName=d.next();
		while(!adminName.matches("^[a-zA-z]+$"))
		{
			System.out.println("Enter admin name:");
			adminName=d.next();
		}
		System.out.println("Enter password:");
		String password=d.next();
		while(!password.matches("^(?=.*[a-z])(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%]).{7}$"))
		{
			System.out.println("Enter password:");
			 password=d.next();
			
		}
		System.out.println("------------login successfully-------------");
		System.out.println("1.Display donor Details,2.Display recipient Details");
		int Details=d.nextInt();
		switch(Details)
		{
		case 1:
		{
			System.out.println("Donor Details");
			break;
		}
		case 2:
		{
			System.out.println("Recepient Details");
			
		}

}
}
}
