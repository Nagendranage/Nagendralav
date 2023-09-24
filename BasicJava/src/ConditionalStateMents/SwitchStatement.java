package ConditionalStateMents;

import java.util.Scanner;

public class SwitchStatement {
	
	 public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 for area of Circle\nEnter 2 area for Rectangle\nEnter 3 for area of Trianlge\nEnter 4 for area of Square");
		int choice=s.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.println("Circle:");
				System.out.println("Enter radius:");
				float r=s.nextFloat();
				System.out.println("Area  of Circle: "+ 3.14*r*r);
			break;
			case 2:
				System.out.println("Rectangle:");
				System.out.println("Enter length:");
				float l=s.nextFloat();
				System.out.println("Enter breath:");
				Float b=s.nextFloat();
				System.out.println("Area  of Circle: "+ l*b);
			break;
			case 3:
				System.out.println("Triangle:");
				System.out.println("Enter breadth:");
				Float b1=s.nextFloat();
				System.out.println("Enter height:");
				Float h=s.nextFloat();
				System.out.println("Area  of Circle: "+ 0.5*b1*h);
			break;
			case 4:
				System.out.println("Square:");
				System.out.println("Enter area:");
				float a=s.nextFloat();
				System.out.println("Area  of Circle: "+ a*a);
			break;
		}
		
	}
}



