package LOOPS;

import java.util.Scanner;

public class ForLoop_StarPattern {
	
	public static void main(String[] args)
	{		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=5; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}




