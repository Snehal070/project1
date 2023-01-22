package numbersProgram;

public class A_16_Factorial 
{
	public static void main(String[] args) 
	{
		int a=8, fact=1;
		for(int b=a; b>=1; b--)
		{
			fact=fact*b; 
		}
		System.out.println("Factorial of "+ a +" is " +fact);
	}
}
