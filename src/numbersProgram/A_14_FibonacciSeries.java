package numbersProgram;

public class A_14_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg-14 --> Java Program for Fibonacci Series upto 10 level");
		int a=0, b=1;
		int c;
		for(int i=1; i<=10; i++)
		{
			c=a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
			
		}
	}

}
