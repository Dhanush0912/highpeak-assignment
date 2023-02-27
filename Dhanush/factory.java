package com.assignment.work;

import java.util.Scanner;

public class Factory {

		
		public void job() {
			int earnings=0,sum=0;
			Scanner s =new Scanner(System.in);
			// star time and end time accepted in the format of HHMM i.e 9am is 0900
			System.out.println("Enter the number of jobs");
			
			int n = s.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println("Enter star time");
				
				int starttime=s.nextInt();
				
				System.out.println("Enter end time");
				
				int endtime = s.nextInt();
				
				System.out.println("Enter profit");
				
				int profit =s.nextInt();
				if(earnings<profit) {
					earnings = profit;
				}
				sum=sum+profit;
			}
			System.out.println("Task:"+(n-1));
			System.out.println("Earnings:"+(sum-earnings));
			
		}
		
	}
