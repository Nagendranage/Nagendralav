package LOOPS;

import java.util.Scanner;

public class WhileLoop_ReverseNumbers {public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number to print its reverse");
	int num=s.nextInt(), r;
	
	while(num>0)
	{
		r=num%10;
		num=num/10;
		System.out.println(r);
	}
}
}
	
	
	


