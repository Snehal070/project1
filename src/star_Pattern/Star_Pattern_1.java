package star_Pattern;

public class Star_Pattern_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Star Pattern - 1");
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=5; y++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("Star Pattern - 2");
		System.out.println();
		for(int a=1; a<=5; a++)
		{
			for(int b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Star Pattern - 3");
		System.out.println();
		for(int c=5; c>=1; c--)
		{
			for(int d=1; d<=c;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Star Pattern - 4 --> Combination of 2 and 3");
		System.out.println();
		for(int e=1; e<=5; e++)
		{
			for(int f=1; f<=e; f++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int g=5; g>=1; g--)
		{
			for(int h=1; h<g; h++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
