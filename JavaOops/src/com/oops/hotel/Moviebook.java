package com.oops.hotel;

public class Moviebook extends MovieAbstract implements Movie1{
	public void booked(String movieName,int ticketPrice)
	{
	System.out.println("Movie Name:"+movieName+"\n"+"Ticket price:"+ticketPrice+"Rs");
	}

	@Override
	public void moviescreen(int ScreenNo) {
		System.out.println("Screen No:"+ScreenNo);
		
	}

	@Override
	public void duration(double movieDuration) {
		System.out.println("movie duration:"+movieDuration);
		
		
	}
}
