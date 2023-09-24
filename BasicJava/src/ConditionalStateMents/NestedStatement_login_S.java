package ConditionalStateMents;

import java.util.Scanner;

public class NestedStatement_login_S {
	
	public  static void  main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Username :");
		String usn=s.next();
		
		if (usn.equals("ShaliniParnarsu"))
		{
			System.out.println("Enter your password");
			String pwd=s.next();
			if (pwd.equals("Shalini1@"))
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Invalid Password");
			}
		}
		else 
		{
			System.out.println("Invalid Username");
		}
	}
	
}



