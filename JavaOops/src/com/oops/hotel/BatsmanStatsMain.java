package com.oops.hotel;
import java.util.*;
public class BatsmanStatsMain {

	public static void main(String[] args) {
		String batsmanName;
		int numberOfBallsFaced,numberOfRunsScored,numberOfTimesOut,noOfInnigs;
		float average,strikeRate;
		BatsmanStatsDetails stats=new BatsmanStatsDetails();
		BatsmanStrikeRate strike = new BatsmanStrikeRate();
		Scanner bat=new Scanner(System.in);
		String namecheck="^[a-zA-z]+$";
		System.out.println("Enter batsman name:");
		batsmanName=bat.next();
		while(!batsmanName.matches(namecheck))
		{
			System.out.println("Enter valid name");
			System.out.println("Enter batsman name:");
			batsmanName=bat.next();
		}
		System.out.println("Enter Number Of Balls Faced:");
		numberOfBallsFaced=bat.nextInt();
		while(numberOfBallsFaced<0)
		{
			System.out.println("Enter Positive Value:");
			numberOfBallsFaced=bat.nextInt();
		}
		System.out.println("Enter Number Of Runs Scored:");
		numberOfRunsScored=bat.nextInt();
		while(numberOfRunsScored<0)
		{
			System.out.println("Enter Positive Value:");
			numberOfRunsScored=bat.nextInt();
		}
		System.out.println("Enter number of times batsman out:");
		numberOfTimesOut=bat.nextInt();
		System.out.println("No of Innigs Batsman Played:");
		noOfInnigs=bat.nextInt();
		stats.setBatsmanName(batsmanName);
		stats.setNumberOfBallsFaced(numberOfBallsFaced);
		stats.setNumberOfRunsScored(numberOfRunsScored);
		stats.setNumberOfTimesOut(numberOfTimesOut);
		stats.setNoOfInnigs(noOfInnigs);
		System.out.println(stats.getBatsmanName());
		System.out.println(stats.getNumberOfBallsFaced());
		System.out.println(stats.getNumberOfRunsScored());
		System.out.println(stats.getNumberOfTimesOut());
		System.out.println(stats.getNoOfInnigs());
		strike.calculate(stats.getBatsmanName(),stats.getNumberOfRunsScored(), stats.getNumberOfTimesOut(),stats.getNumberOfBallsFaced(),stats.getNoOfInnigs());
		strike.calculate(stats.getBatsmanName(),stats.getNumberOfRunsScored(),stats.getNumberOfTimesOut(),stats.getNoOfInnigs());
		
		}
}
