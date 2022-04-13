package com.bridgelabz.day6;
import java.util.Scanner;

    public class StopWatch {

		public static void main(String[] args) {
		    Scanner sc =new Scanner(System.in);
			System.out.println("Enter Start Time :");
			System.out.println("Enter Stop Time :");
			int Start=sc.nextInt();
			int Stop=sc.nextInt();
			int count=0;
			for(int i=Start;i<Stop;i++) {
			count=count+1;
			}
			System.out.print( "No of sec is "+count);
		}
}
