package replitTasks;

import java.util.Scanner;

public class Task35LogicalOperators {

	public static void main(String[] args) {
		
		/*
		 * Create a program that prompt user with question:  "Do you need a loan?"(Use a boolean)
		 * If the result is true then prompt user with question: "What is your credit score?". 
		 * Otherwise eligibility is "Unknown"
		 * Based on the score define users eligibility:
		 * - if score is below  600 --> eligibility = "Not eligible"
		 * - if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
		 * - if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
		 * - if score is higher than any other previous values --> eligibility = "Definitely eligible" .   
		 * **Output:** 
		 * The eligibility is ____
		 */
		
		Scanner inp=new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean loan=inp.nextBoolean();
		
		if(loan) {
			System.out.println("What is your credit score?");
			int creditScore=inp.nextInt();
			if (creditScore<600) {
				System.out.println("The eligibility is Not eligible");
			}
			else if(creditScore>=600 && creditScore<=700) {
				System.out.println("The eligibility is Maybe eligible");
			}
			else if (creditScore>=701 && creditScore<=800) {
				System.out.println("The eligibility is Eligible");
			}
			else if(creditScore>800) {
				System.out.println("The eligibility is Definitely eligible");
			}
		}
		else {
			System.out.println("The eligibility is Not eligible");
		}
		
		
		
	}

}
