package basicjava;

import java.util.Scanner;

public class Cal {
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void div(int a,int b)
	{
		System.out.println((float)a/(float)b);
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		b=sc.nextInt();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		add(a,b);
		
		

	}

}
