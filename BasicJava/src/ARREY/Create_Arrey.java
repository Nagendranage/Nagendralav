package ARREY;

import java.util.Scanner;

public class Create_Arrey {
	
	public static void main(String[] args)
	{
		System.out.println("Way1: ");
		int a[]= {10,20,30,40,50};
		String b[]= {"C","C++","C#","Ruby","Scala","Python","Java","ASP.Net" };//size=7
		
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		System.out.println("Way2: ");
		Scanner s=new Scanner(System.in);
		int a1[]=new int[5];//size=5
		
		System.out.println("Enter Data in Array");
		for(int i=0; i<=4; i++)//Index(0-4)
		{
			a1[i]=s.nextInt();
		}
		System.out.println("Display Array");
		for(int i=0;i<=4;i++)
		{
			System.out.println(a1[i]);
		}
	}
}


