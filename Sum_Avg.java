package naveen.java;

import java.util.Scanner;

public class Sum_Avg 
{

	public static void main(String[] args) 
	{
		int sum;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=sc.nextInt();
		System.out.println("enter the number");
		int n2=sc.nextInt();
		System.out.println("enter the number");
		int n3=sc.nextInt();
		System.out.println("enter the number");
		int n4=sc.nextInt();
		System.out.println("enter the number");
		int n5=sc.nextInt();
		sum=n1+n2+n3+n4+n5;
		avg=sum/5;
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
