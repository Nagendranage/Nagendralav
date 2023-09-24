package LOOPS;

import java.util.Scanner;

public class DoWhile_Area {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String c;
		do{
			System.out.println("Enter 1 for area of Circle. \nEnter 2 area for Rectangle. \nEnter 3 for area of Trianlge.\nEnter 4 for area of Square.");
			int choice=s.nextInt();
			
			switch(choice)
			{
				
			case 1:
				System.out.println("Enter Radius");
				float r=s.nextFloat();
				System.out.println("Area of circle: "+ (3.14*r*r));
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
			
			default:
				System.out.println("Invalid input");
			}
			System.out.println("Do you want to continue");
			System.out.println("Enter yes to continue");
			c=s.next();
			
		}
		
		while(c.equalsIgnoreCase("yes"));
	}
}



