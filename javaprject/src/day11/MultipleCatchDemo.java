package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		System.out.println("I am in main method");
		int numberOne,numberTwo,numberThree;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		while(true)
			{
			try {
				numberOne=sc.nextInt();
				numberTwo=sc.nextInt();
				numberThree=numberOne/numberTwo;
				System.out.println("Divion is "+numberThree);
			    break;	
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input.Please enter integer only. ");
				sc.nextInt();
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception caught:"+e.getMessage());
				break;
				
			}
			catch(Exception e)
			{
				System.out.println("Exception caught: "+e.getMessage());
				break;
			}
			sc.close();
				
			}

	}

}
