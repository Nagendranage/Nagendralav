package LOOPS;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args)
	{
		int fact=1,i;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for(i=1;i<=num;i++)
		{    
		      fact=fact*i;    
		 }    
		System.out.println(num+"factorial"+":\t"+fact);
		
		 
		}   
}


