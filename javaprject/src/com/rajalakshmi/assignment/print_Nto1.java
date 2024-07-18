package com.rajalakshmi.assignment;

import java.util.Scanner;

public class print_Nto1 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending number: ");
		a=sc.nextInt();
		//b=a;
		while(a>=1)
		{
			System.out.println(a);
			a--;
		}

	}

}
