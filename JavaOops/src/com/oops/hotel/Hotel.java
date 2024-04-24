package com.oops.hotel;

public class Hotel {
	int hotelId;
	String hotelName,hotelLocation;
	boolean dining;
	public Hotel()
	{
		
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public boolean isDining() {
		return dining;
	}
	public void setDining(boolean dining) {
		this.dining = dining;
	}
	
	public Hotel(int hotelId, String hotelName, String hotelLocation, boolean dining) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.dining = dining;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", dining=" + dining + "]";
	}
	

	
		

	}




