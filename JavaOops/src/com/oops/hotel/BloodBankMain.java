package com.oops.hotel;
import java.util.*;
public class BloodBankMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BloodBank o=new BloodBank();
		BloodBankUser e=new BloodBankUser();
		BloodBankAdmin g=new BloodBankAdmin();
		System.out.println("                  **************BloodBank*******************");
		System.out.println("Select \n 1.admin \n 2.user");
		o.selectOption=scan.nextInt();
		if(o.selectOption<0)
		{
			System.out.println("Select \n 1.admin \n 2.user");
			o.selectOption=scan.nextInt();
		}
		switch(o.selectOption)
		{
		case 1:
			g.admin();
			break;
		case 2:
			e.user();
			break;
		
		default:
		{
			System.out.println("Invalid");
		}
		}

	}

}
