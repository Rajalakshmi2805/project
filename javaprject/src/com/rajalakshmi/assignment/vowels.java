package com.rajalakshmi.assignment;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string:");
		str=sc.nextLine();
	
	}
		public static boolean vowels(String input)
		{
			return input.toLowerCase().matches(".*[aeiou].*");
			
		}
     
	}


