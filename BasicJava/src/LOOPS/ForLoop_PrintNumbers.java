package LOOPS;

import java.util.Scanner;

public class ForLoop_PrintNumbers {
	
	public static void main(String[] args)
	{
//		System.out.println("Numbers in sequence");
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println("\nNumbers in reverse");
//		for(int i=10; i>=1; i--)
//		{
//			System.out.println(i);
//		}
		
		Scanner s=new Scanner(System.in);
		{
			System.out.println("Enter start and end range");
			int start=s.nextInt();
			int end=s.nextInt();
			
			System.out.println("Numbers in sequence");
			for(int i=start; i<=end; i++)
				{
					System.out.println(i);
				}
				System.out.println("\nNumbers in reverse");
				for(int i=end; i>=start; i--)
				{
					System.out.println(i);
				}
		}
	}
}



