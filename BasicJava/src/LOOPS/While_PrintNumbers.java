package LOOPS;

import java.util.Scanner;

public class While_PrintNumbers {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start and end range:");
		int start=s.nextInt();
		int end=s.nextInt();
		int i;
		
		System.out.println("Number in sequence:");
		i=start;
		while(i<=end)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("/nNumbers in reverse:");
		i=end;
		while(i>=start)
		{
			System.out.println(i);
			i--;
		}
	}
}


