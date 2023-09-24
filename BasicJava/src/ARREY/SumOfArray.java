package ARREY;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=s.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter Data: ");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of array:"+sum);
	}
}



