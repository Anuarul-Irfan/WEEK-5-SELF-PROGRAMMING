package selfprogramming;

import java.util.Scanner;

public class BlockStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int amount = 10;
		
		System.out.print("Enter balance: ");
		int balance = sc.nextInt();
		
		if (amount <= balance) 
			   balance = balance - amount;
			   System.out.println("Acct new balance = " + balance);
		


	}

}
