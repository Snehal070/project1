package numbersProgram;

public class A_10_11_12_13_Sum_SeriesNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg-10-->Java Program to Find Sum of first 10 Natural Numbers");
		int SumNatural=0;
		
		for(int a=1; a<=10; a++)
		{
			SumNatural=SumNatural+a;
		}
		System.out.println("Sum Of Natural Number - "+SumNatural);
		
		System.out.println();
		System.out.println("Prg-11-->Java Program to Find Multiplicatin of first 10 Natural Numbers");
		int SumMulti=1;
		
		for(int b=1; b<=10; b++)
		{
			SumMulti=SumMulti*b;
		}
		System.out.println("Multiplication Of Natural Number - "+SumMulti);
		
		System.out.println();	
		
		System.out.println("Prg 12 --> Java Program to Find Addition of first 10 Even Numbers ");
		int SumEven=0;
		
		for(int d=1; d<=10; d++)
		{
			if(d%2==0)
			{
				SumEven=SumEven+d;
			}
		}
		System.out.println("Addition of Even Number in Between 1 to 10 is "+SumEven);
	
		System.out.println();
		
		System.out.println("Prg 13 --> Java Program to Find Addition of first 10 Odd Numbers ");
		int SumOdd=0;
		for(int e=1; e<=10; e++)
		{
			if(e%2==1)
			{
				SumOdd=SumOdd+e;
			}
		}
		System.out.println("Sum of Odd Number in Between 1 to 10 is "+SumOdd);
		
	}
}

