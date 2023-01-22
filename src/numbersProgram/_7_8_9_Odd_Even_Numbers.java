package numbersProgram;

public class _7_8_9_Odd_Even_Numbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg 7-->Check Number is Even Or Odd");
		int a=21;
		if(a%2==0)
		{
			System.out.println(a+" is a even number");
		}
		else
		{
			System.out.println(a+" is a odd number");
		}
		
		System.out.println();
		
		System.out.println("Prg 8 --> Print Even Numbers in between 1 to 30");
		int num=30;
		for(int b=1; b<=num; b++)
		{
			if(b%2==0)
			{
				System.out.print(b+", ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Prg 9 --> Print Odd Numbers in between 1 to 30");
		for(int c=1; c<=num; c++)
		{
			if(c%2!=0)
			{
				System.out.print(c+", ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		
	}

}
