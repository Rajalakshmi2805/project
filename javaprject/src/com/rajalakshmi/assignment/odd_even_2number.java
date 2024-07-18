package com.rajalakshmi.assignment;
import java.util.Scanner;
public class odd_even_2number {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		x=sc.nextInt();
		System.out.println("Enter the second number:");
		y=sc.nextInt();
		if(x%2==0 && y%2==0)
		{
			System.out.println("Yes,both numbres are Even");
		}
		else
		{
			System.out.println("No");
		}

	}

}
