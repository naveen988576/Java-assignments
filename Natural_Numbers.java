package naveen.java;

import java.util.Scanner;

public class Natural_Numbers 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of natural numbers");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}
