package com.oops.hotel;

public class BatsmanStrikeRate extends BatsmanAverage {

	public void calculate(String name,double noOfRuns,int noOfOut, double NoOfBallsFaced,int noOfInnigs) {
		double strikeRate = (noOfRuns / NoOfBallsFaced * 100);
		System.out.println("Batsman name:"+name+" No Of Innigs Played:"+noOfInnigs+" No Of Times Out:"+noOfOut+" strike rate:" +String.format("%.2f",strikeRate));

	}
}
