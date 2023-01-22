package star_Pattern;

public class Star_Patter_2 
{
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("Star Pattern - 5");
		System.out.println();
		for(int a=1;a<=5;a++)
		{
			for(int b=5; b>a; b--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Star Pattern - 6");
		System.out.println();
		for(int d=5; d>=1; d--)
		{
			for(int e=4; e>=d; e--)
			{
				System.out.print(" ");
			}
			for(int f=1; f<=d; f++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Star Pattern - 7 --> Combination of 5 and 6");
		System.out.println();
		for(int g=1; g<=5; g++)
		{
			for(int h=4; h>=g; h--)
			{
				System.out.print(" ");
			}
				for(int i=1; i<=g; i++)
				{
					System.out.print("*");
				}
				System.out.println();
			}	
		for(int j=4; j>=1; j--)
		{
			for(int k=4; k>=j; k--)
			{
				System.out.print(" ");
			}
				for(int l=1; l<=j; l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}	
	}
}
