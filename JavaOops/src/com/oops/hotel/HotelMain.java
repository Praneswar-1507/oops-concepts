package com.oops.hotel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HotelMain {

	public static void main(String[] args) {
		Hotel sc = new Hotel();
		int hotelId;
		String hotelName, hotelLocation;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter hotel Id:");
		hotelId = a.nextInt();
		while (hotelId < 0) {
			System.out.println("Enter hotel Id:");
			hotelId = a.nextInt();
		}
		String nameCheck="^[A-Za-z]+$";
		
		
		System.out.println("Enter hotel name:");
		hotelName = a.next();
		while(!hotelName.matches(nameCheck))
		{
			System.out.println("Enter valid hotel name:");
			hotelName = a.next();
		}

		
		System.out.println("Enter hotel location:");
		hotelLocation = a.next();
		while(!hotelLocation.matches(nameCheck))
		{
			System.out.println("Enter valid hotel location:");
			hotelLocation = a.next();
		}
		System.out.println("Enter dining availability(true/false):");
		boolean dining = a.nextBoolean();

		sc.setHotelId(hotelId);
		sc.setHotelName(hotelName);
		sc.setHotelLocation(hotelLocation);
		sc.setDining(dining);
		System.out.println("Hotel ID:" + sc.hotelId + "\n" + "Hotel Name:" + sc.hotelName + "\n" + "Hotel Location:"
				+ sc.hotelLocation + "\n" + "Hotel dining:" + sc.dining);

	}

}


	
