package ConditionalStateMents;

import java.util.Scanner;

public class NestedStatement_Login {
	
	public  static void  main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Username :");
		String usn=s.next();
		System.out.println("Enter the password :");
		String pwd=s.next();
		
		if (usn.equals("ShaliniParnarsu") && pwd.equals("Shalini1@"))
		{
			System.out.println("Login successful");
		}
		else 
		{
			System.out.println("Invalid Credentials");
		}
	}
}



