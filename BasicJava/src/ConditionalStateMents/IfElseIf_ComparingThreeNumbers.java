package ConditionalStateMents;

import java.util.Scanner;

public class IfElseIf_ComparingThreeNumbers {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three Numbers :");
		int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a +" is greatest");
		}
		else if(b>a && b>c)//Ladder statements
		{
			System.out.println(b +" is greatest");
		}
		else if(c>a && c>b)
		{
			System.out.println(c +" is greatest");
		}
		else
		{
			System.out.println("All numbers are same");
		}
	}
}



