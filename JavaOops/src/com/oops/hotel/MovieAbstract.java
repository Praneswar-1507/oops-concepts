package com.oops.hotel;

public  abstract class  MovieAbstract {
	public void noOfSeat(String movieName,int noOfSeats)
	{
		System.out.println("MovieName:"+movieName+"\n"+"No of seats:"+noOfSeats);
	}
	public abstract void booked(String movieName,int ticketPrice);

}
