package com.bloodbank.projectnew;

import java.sql.SQLException;
import java.util.*;

public class BloodBankUser {
	boolean donorIdChecker(Scanner scanner, String[] donorId, String donorID, BloodBank a) {
		while (scanner.hasNext()) {
			donorID = scanner.next();
			for (int i = 0; i < donorId.length; i++) {
				if (donorId[i].equals(donorID)) {
					System.out.println("matched");
					a.setDonorId(donorID);
					return true;
				}
			}
			System.out.println("Enter valid ID:");
		}
		return false;
	}

	public void user() throws ClassNotFoundException, SQLException {
		String bloodType, donorName, password, donorID = null;
		int quantity, noOfDays;
		char donatedBefore;
		BloodBank a = new BloodBank();
		BloodBankAbstract b = new BloodBankAbstract();
		Validation c = new Validation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you want to donate blood(yes for donating blood/no for receiving blood):");
		String donor = scanner.next();
		List<String> bloodgroup = new ArrayList<>();
		bloodgroup.add("A+");
		bloodgroup.add("B+");
		bloodgroup.add("O+");
		String[] donorId = { "abc123", "adc321", "ada223" };
		if (donor.equalsIgnoreCase("yes")) {
			System.out.println("Are You New Donor(yes/no):");
			String user = scanner.next();
			if (user.equalsIgnoreCase("No")) {
				System.out.println("enter Donor name:");
				donorName = scanner.next();
				a.setDonorName(donorName);
				System.out.println("Enter Donor id:");
				if (donorIdChecker(scanner, donorId, donorID, a)) {
					System.out.println("Enter Password:");
					password = scanner.next();
					a.setPassword(c.passwordCheck(scanner, password));
					System.out.println("Have You Donated Before(y/n):");
					donatedBefore = scanner.next().charAt(0);
					while (!(donatedBefore == 'y' || donatedBefore == 'n')) {
						System.out.println("Enter Either y or n:");
						donatedBefore = scanner.next().charAt(0);
					}
					if (donatedBefore == 'n') {
						System.out.println("Enter Blood Type(A+,AB+,AB-,O+,O-,A-,B-,B+):");
						bloodType = scanner.next();
						a.setBloodType(c.BloodTypeCheck(scanner, bloodType));
						System.out.println("Enter Quantity Of Blood(unit):");
						quantity = scanner.nextInt();
						a.setQuantity(c.quantityCheck(scanner, quantity));
						b.donate(a.getDonorId(), a.getBloodType());
						b.donate(a.getQuantity());
					}
					if (donatedBefore == 'y') {
						System.out.println("Enter number of days since previous blood donation:");
						noOfDays = scanner.nextInt();
						if (noOfDays > 90) {
							System.out.println("Enter Blood Type(A+,AB+,AB-,O+,O-,A-,B-,B+):");
							bloodType = scanner.next();
							a.setBloodType(c.BloodTypeCheck(scanner, bloodType));
							System.out.println("Enter Quantity Of Blood(unit):");
							quantity = scanner.nextInt();
							a.setQuantity(c.quantityCheck(scanner, quantity));
							b.donate(a.getDonorId(), a.getBloodType());
							b.donate(a.getQuantity());
						} else {
							System.out.println("Not Eligible To Donate");
						}
					}
				}
			} else {
				System.out.println("Enter Donor Id");
				donorID = scanner.next();
				System.out.println("Enter user name:");
				donorName = scanner.next();
				while (!donorName.matches("^[a-zA-z]+$")) {
					System.out.println("Enter Valid User Name:");
					donorName = scanner.next();
				}
				System.out.println("Enter Phone Number:");
				int phoneNumber = scanner.nextInt();
				System.out.println("create password:");
				password = scanner.next();
				a.setPassword(c.passwordCheck(scanner, password));
				System.out.println("Enter password again:");
				String confirmPassword = scanner.next();
				while (!password.matches(confirmPassword)) {
					System.out.println("Enter correctly:");
					confirmPassword = scanner.next();
				}
				System.out.println("               ------------Registered Succesfully-------------");
				System.out.println("Enter Blood Type(A+,AB+,AB-,O+,O-,A-,B-,B+):");
				bloodType = scanner.next();
				a.setBloodType(c.BloodTypeCheck(scanner, bloodType));
				System.out.println("Enter Quantity Of Blood(unit):");
				quantity = scanner.nextInt();
				a.setDonorId(donorID);
				a.setQuantity(c.quantityCheck(scanner, quantity));
				a.setDonorName(donorName);
				b.donate(a.getDonorName(), a.getBloodType(), a.getQuantity());

			}
			BloodBankAdmin g = new BloodBankAdmin();
			g.sqlUpdate(a);
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
			if (bloodGroup.equalsIgnoreCase("Ab+")) {
				System.out.println("your universal recepient you can receive blood from every bloodgroup");
				System.out.println("Enter quantity of blood(unit):");
				int quantityReceived = scanner.nextInt();
				a.setRecipientName(recipientName);
				a.setQuantityReceived(c.quantityCheck(scanner, quantityReceived));
				b.bloodReceived(a.getRecipientName(), a.getBloodGroup(), a.getQuantityReceived());
			}
			for (String s : bloodgroup) {
				if (s.equalsIgnoreCase(bloodGroup)) {
					System.out.println("blood available");
					System.out.println("Enter quantity of blood(unit):");
					quantity = scanner.nextInt();
					a.setQuantity(c.quantityCheck(scanner, quantity));
					a.setRecipientName(recipientName);
					b.bloodReceived(a.getRecipientName(), a.getBloodGroup(), a.getQuantity());
				}
			}
			System.out.println("            --------Thankyou for contacting us--------");
		}
	}
}
