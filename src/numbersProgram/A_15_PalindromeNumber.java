package numbersProgram;

public class A_15_PalindromeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg 15-->Java Program for Palindrome Number ");
		int a=121;
		int num=a;
		int rem,rev=0;
		while(num!=0)
		{
			rem=num%10; 
			rev=rev*10+rem; 
			num=num/10; 
		}
		if(a==rev)
		{
			System.out.println(a+" is palindrome Number");
		}
		else
		{
			System.err.println(a+" is not a palindrome Number");
		}
			
	}

}
