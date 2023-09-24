package ConditionalStateMents;

import java.util.Scanner;

public class If_Else_Statement_LicenseProcess {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age :");
		int age=s.nextInt();
		
		if(age>=18 && age<=60) //True condition
		{
			System.out.println("You are eligilble for the license.");
		}
		else //False condition
		{
			System.out.println("You are not eligilble for the license.");
		}
	}
}



