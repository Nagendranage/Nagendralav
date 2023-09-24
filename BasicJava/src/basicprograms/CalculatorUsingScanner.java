package basicprograms;

	import java.util.Scanner;

	public class CalculatorUsingScanner 

	{
		//Note:
			//Scanner: Its a predefined class which is present in java.util package.
			//Using Scanner class we can take data at the runtime 
			//Syntax: Scanner s= new Scanner(System.in);
			
			//How to import predefined class >> ctrl+shift+O
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter two numbers a and b : ");
			int a=s.nextInt(), b=s.nextInt();
			
			System.out.println("ADD : " + (a+b));
			System.out.println("SUB : " + (a-b));
			System.out.println("MUL : " + (a*b));
			System.out.println("DIV : " + (a/b));
			
		}
		
	}


