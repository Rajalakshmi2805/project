package com.rajalakshmi.assignment;
import java.util.Scanner;
public class subraction {

	public static void main(String[] args) {
		int x,y,value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		x=sc.nextInt();
		System.out.println("Enter the second number:");
		y=sc.nextInt();
		value=x-y;
		System.out.println("The subraction of two numbers:"+value);
	}

}
