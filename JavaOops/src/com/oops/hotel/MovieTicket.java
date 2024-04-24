package com.oops.hotel;
import java.util.*;
public class MovieTicket {

	public static void main(String[] args) {
		String movieName,seatNo,theatreName;
		int ticketPrice,noOfSeats,screenNo;
		double movieDuration;
		Scanner scanner=new Scanner(System.in);
		String nameCheck="^[a-zA-Z]+$";
		System.out.println("Enter Theater name:");
		theatreName=scanner.next();
		while(!theatreName.matches(nameCheck))
		{
			System.out.println("Enter valid Theater name:");
			theatreName=scanner.next();
		}
		System.out.println("Enter movie name:");
		movieName=scanner.next();
		System.out.println("Enter No Of Seats:");
		noOfSeats=scanner.nextInt();
		while(noOfSeats<0)
		{
			System.out.println("Enter No Of Seats:");
			noOfSeats=scanner.nextInt();
		}
		System.out.println("Select seat No:");
		seatNo=scanner.next();
		System.out.println("Enter ticket price:");
		ticketPrice=scanner.nextInt();
		while(ticketPrice<0)
		{
			System.out.println("Enter valid ticket price:");
			ticketPrice=scanner.nextInt();
		}
		System.out.println("Enter movie duration:");
		movieDuration=scanner.nextDouble();
		System.out.println("Enter screen no:");
		screenNo=scanner.nextInt();
		while(screenNo<0)
		{
			System.out.println("Enter valid screen no:");
			screenNo=scanner.nextInt();
		}
		MovieTicketBooking a=new MovieTicketBooking();
		a.setTheatreName(theatreName);
		a.setMovieName(movieName);
		a.setNoOfSeats(noOfSeats);
		a.setSeatNo(seatNo);
		a.setTicketPrice(ticketPrice);
		Moviebook c=new Moviebook();
		c.booked(movieName,ticketPrice);
		c.moviescreen(screenNo);
		c.duration(movieDuration);
		
		

	}

}
