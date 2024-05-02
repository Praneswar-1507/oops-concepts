package com.bloodbank.projectnew;
import java.util.*;
public class BloodBankAdmin {
	public void admin()
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter admin name:");
		String adminName=d.next();
		while(!adminName.matches("abc123"))
		{
			System.out.println("Enter Valid name:");
			adminName=d.next();
		}
		System.out.println("Enter password:");
		String password=d.next();
		while(!password.matches("abc@123"))
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
			System.out.println("Donor Details:\n1.Name:sachin\t BloodGroup:Ab+\t ContactNo:12345678 \n2.Name:dhoni\t BloodGroup:A+\t ContactNo:13456788 \n3.Name:virat\t BloodGroup:Ab-\t ContactNo:1456788");
			break;
		}
		case 2:
		{
			System.out.println("Recepient Details:\n1.Name:gill\t  BloodGroup:A-\t ContactNo:1345689 \n2.Name:Abd\t BloodGroup:Ab+\t ContactNo:12345687 \n3.Name:kholi\t BloodGroup:O-\t ContactNo:2324567");
			
		}

}
}
}
