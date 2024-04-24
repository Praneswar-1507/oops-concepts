package com.oops.hotel;

public class MovieTicketBooking {
	String movieName,SeatNo,theatreName;
	int ticketPrice,noOfSeats;
	public MovieTicketBooking()
	{
		
	}
	public String getMovieName() {
		return movieName;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public MovieTicketBooking(String movieName, String seatNo, String theatreName, int ticketPrice, int noOfSeats) {
	super();
	this.movieName = movieName;
	SeatNo = seatNo;
	this.theatreName = theatreName;
	this.ticketPrice = ticketPrice;
	this.noOfSeats = noOfSeats;
}
	@Override
	public String toString() {
		return "MovieTicketBooking [movieName=" + movieName + ", SeatNo=" + SeatNo + ", theatreName=" + theatreName
				+ ", ticketPrice=" + ticketPrice + ", noOfSeats=" + noOfSeats + "]";
	}

	}
	


