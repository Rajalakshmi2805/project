package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the number:");
			int number=sc.nextInt();
			System.out.println(number%2==0 ? number+"is Even": number + "is odd");
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input...........");
		}
		finally
		{
			System.out.println("In Finally...............");
			sc.close();
		}
		

	}

}
