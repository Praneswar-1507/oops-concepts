package com.oops.hotel;

public class BatsmanStatsDetails {
	String batsmanName;
	int numberOfBallsFaced,numberOfRunsScored,numberOfTimesOut,noOfInnigs;
	public BatsmanStatsDetails()
	{
		
	}
	
	public int getNoOfInnigs() {
		return noOfInnigs;
	}

	public void setNoOfInnigs(int noOfInnigs) {
		this.noOfInnigs = noOfInnigs;
	}

	public int getNumberOfTimesOut() {
		return numberOfTimesOut;
	}

	public void setNumberOfTimesOut(int numberOfTimesOut) {
		this.numberOfTimesOut = numberOfTimesOut;
	}

	public String getBatsmanName() {
		return batsmanName;
	}	
	public void setBatsmanName(String batsmanName) {
		this.batsmanName = batsmanName;
	}
	public int getNumberOfBallsFaced() {
		return numberOfBallsFaced;
	}
	public void setNumberOfBallsFaced(int numberOfBallsFaced) {
		this.numberOfBallsFaced = numberOfBallsFaced;
	}
	public int getNumberOfRunsScored() {
		return numberOfRunsScored;
	}
	public void setNumberOfRunsScored(int numberOfRunsScored) {
		this.numberOfRunsScored = numberOfRunsScored;
	}
	public BatsmanStatsDetails(String batsmanName, int numberOfBallsFaced, int numberOfRunsScored) {
		super();
		this.batsmanName = batsmanName;
		this.numberOfBallsFaced = numberOfBallsFaced;
		this.numberOfRunsScored = numberOfRunsScored;
	}
	@Override
	public String toString() {
		return "BatsmanStatsDetails [batsmanName=" + batsmanName + ", numberOfBallsFaced=" + numberOfBallsFaced
				+ ", numberOfRunsScored=" + numberOfRunsScored + "]";
	}
	
	

}
