package com.rajalakshmi.assignment;
import java.util.Scanner;
public class swaping {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A value:");
		a=sc.nextInt();
		System.out.println("Enter the B value:");
		b=sc.nextInt();
		System.out.println("Before swaping A value is:"+ a + "B value is:"+b);
		b=b+a;//now b is a addition of a and b
		a=b-a;//now a is (b+a)-a=b(b swaped)
		b=b-a;//now b is (b+a)-b=a(a swaped)
		System.out.println("After swaping A value is:"+a+"B value is:"+b);

	}

}
