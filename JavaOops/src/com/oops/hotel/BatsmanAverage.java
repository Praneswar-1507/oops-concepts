package com.oops.hotel;

public class BatsmanAverage {


	public void calculate(String name,double noOfRuns, double noOfOut,int noOfInnigs) {
		double average = (noOfRuns /(noOfInnigs- noOfOut));
		System.out.println("Batsman name:"+name+" No of innings played:"+noOfInnigs+" No of times got out:"+noOfOut+" average :" +String.format("%.2f", average));

	}

}
