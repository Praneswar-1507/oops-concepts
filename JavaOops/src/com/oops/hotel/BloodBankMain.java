package com.oops.hotel;

import java.util.*;

public class BloodBankMain {

	public static void main(String[] args) {
		String bloodType = null, donorName;
		int quantity = 0, noOfDays;
		char donatedBefore;
		BloodBank a = new BloodBank();
		Donate b = new Donate();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to donate blood(yes/no):");
		String donor = scanner.next();
		List<String> bloodgroup = new ArrayList<>();
		bloodgroup.add("A+");
		bloodgroup.add("B+");
		bloodgroup.add("O+");
		if (donor.equalsIgnoreCase("yes")) {
			System.out.println("Enter Donor Name:");
			donorName = scanner.next();
			while (!donorName.matches("^[a-zA-z]+$")) {
				System.out.println("Enter Valid Name:");
				donorName = scanner.next();
			}
			System.out.println("Have You Donated Before(y/n):");
			donatedBefore = scanner.next().charAt(0);
			while (!(donatedBefore == 'y' || donatedBefore == 'n')) {
				System.out.println("Enter Either y or n:");
				donatedBefore = scanner.next().charAt(0);

			}
			if (donatedBefore == 'n') {
				System.out.println("Enter Blood Type(A+,AB+,AB-,O+,O-,A-,B-,B+):");
				bloodType = scanner.next();
				while (!bloodType.matches("^(A|B|AB|O)[+-]$")) {
					System.out.println("Enter valid Blood Type(A+,AB+ve,AB-ve,o+ve,o-ve,A-,b-):");
					bloodType = scanner.next();
				}

				System.out.println("Enter Quantity Of Blood(unit):");
				quantity = scanner.nextInt();
				while (quantity < 0) {
					System.out.println("Enter Quantity Of Blood(unit):");
					quantity = scanner.nextInt();
				}
					a.setBloodType(bloodType);
					a.setDonorName(donorName);
					a.setQuantity(quantity);

					b.donate(a.getDonorName(), a.getBloodType());
					b.donate(a.getQuantity());
			}

			if (donatedBefore == 'y') {
				System.out.println("Enter number of days since previous blood donation:");
				noOfDays = scanner.nextInt();
				if (noOfDays > 90) {
					System.out.println("Enter Blood Type(A+,AB+,AB-,O+,O-,A-,B-,B+):");
					bloodType = scanner.next();
					while (!bloodType.matches("^(A|B|AB|O)[+-]$")) {
						System.out.println("Enter valid Blood Type(A+,AB+ve,AB-ve,o+ve,o-ve,A-,b-):");
						bloodType = scanner.next();
					}

					System.out.println("Enter Quantity Of Blood(unit):");
					quantity = scanner.nextInt();
					while (quantity < 0) {
						System.out.println("Enter Quantity Of Blood(unit):");
						quantity = scanner.nextInt();
					}
						a.setBloodType(bloodType);
						a.setDonorName(donorName);
						a.setQuantity(quantity);

						b.donate(a.getDonorName(), a.getBloodType());
						b.donate(a.getQuantity());

				} else {
					System.out.println("Not Eligible To Donate");
				}
			}

			
		} else {
			System.out.println("Enter Recipient name:");
			String recipientName = scanner.next();
			while (!recipientName.matches("^[a-zA-z]+$")) {
				System.out.println("Enter Valid Name:");
				recipientName = scanner.next();
			}
			System.out.println("Enter blood group(A+,AB+ve,AB-ve,o+ve,o-ve,A-,b-):");
			String bloodGroup = scanner.next();
			a.setBloodGroup(bloodGroup);
			a.setBloodGroup(bloodGroup);
			for (String s : bloodgroup) {
				if (s.equalsIgnoreCase(bloodGroup)) {
					System.out.println("Blood available");

					System.out.println("Enter quantity of blood(unit):");
					int quantityReceived = scanner.nextInt();
					if(quantityReceived<0)
					{
						System.out.println("Enter Positive value:");
						 quantityReceived = scanner.nextInt();
					}
						
					a.setRecipientName(recipientName);
					a.setQuantityReceived(quantityReceived);
					b.bloodReceived(a.getRecipientName(), a.getBloodGroup(), a.getQuantityReceived());
				}
			}
			System.out.println("-------Thankyou for contacting us-----");
		}
	}
}
