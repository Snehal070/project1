package numbersProgram;

public class A_20_21_PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg-20-->Java Program to Check Number is Prime or Not ");
		// Check Number is Prime Or Not
		
		int a=4; int b=0;
		for(int i=2; i<=a-1;i++)
		{
			if(a%i==0)
			{
				b=b+i;
			}
		}
		if(b>0)
		{
			System.out.println(+a +" is not a Prime Number");
		}
		else
		{
			System.out.println(+a +" is a Prime Number");
		}
		System.out.println("Prg-21-->Java Program to Display Prime Numbers between 1 to 100 ");
		int assume=0;
		for(int z=1; z<=100; z++)
		{
			for(int c=2; c<=z-1; c++)
			{
				if(z%c==0)
				{
					assume=assume+1; 
				}
			}
			if(assume==0)
			{
				System.out.println(z+" ");
			}
			else
			{
				assume=0;
			}
		}
	}
}







