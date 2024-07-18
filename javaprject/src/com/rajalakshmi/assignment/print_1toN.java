package com.rajalakshmi.assignment;
import java.util.Scanner;
public class print_1toN {

	public static void main(String[] args) {
		int a=1,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending number: ");
		b=sc.nextInt();
		while(a<=b)
		{
			System.out.println(a);
			a++;
		}

	}

}
