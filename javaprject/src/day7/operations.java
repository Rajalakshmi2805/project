package day7;

public class operations {
	public static  boolean isPalindrome(int number)
	{
		int rev=0;
		int dNumber=number;
		while(number!=0)
		{
			rev=rev*10+number%10;
			number/=10;
		}
		return dNumber==rev;
	}
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev=new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}

}
