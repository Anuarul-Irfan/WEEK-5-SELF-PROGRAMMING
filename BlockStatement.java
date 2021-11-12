package selfprogramming;

import java.util.Scanner;
public class BlockStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int MAX = 10, errorCount = 0;
		
		System.out.print("Enter Total: ");
		int total = sc.nextInt();
		
		if (total > MAX)
		{
		   System.out.println ("Error!!");
		   errorCount++;
		}

	}
}

