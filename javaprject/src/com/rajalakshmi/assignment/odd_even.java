package com.rajalakshmi.assignment;
import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		x=sc.nextInt();
		if (x%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}

	}

}
