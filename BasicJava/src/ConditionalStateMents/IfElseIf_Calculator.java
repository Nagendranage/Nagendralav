	package ConditionalStateMents;

	import java.util.Scanner;

	public class IfElseIf_Calculator 
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Division\nEnter 4 for Multiplication");
			
			int choice=s.nextInt();
			System.out.println("Enter two numbers:");
			int x=s.nextInt(), y=s.nextInt();
		
			if(choice==1) 
			{
				System.out.println("Addition"+ (x+y));
			}
			else if(choice==2)
			{
				System.out.println("Subtraction"+ (x-y));
			}
			else if(choice==3)
			{
				System.out.println("Division"+ (x/y));
			}
			else if(choice==4)
			{
				System.out.println("Multiplication" + (x*y));
			}
			else
			{
				System.out.println("Invalid choice");
			}
			
		}
			
	}




