package numbersProgram;

public class _1_2_3_18_LargestSmallestNumbers 
{
	public static void main(String[] args)
	{
		System.out.println("Prg 1--> Find Largest of two numbers");
		int a=10;
		int b=30;
		if(a>b)
		{
			System.out.println(a+" is a larger number");
		}
		else if(a<b)
		{
			System.out.println(b+" is a larger number");
		}
		else
		{
			System.out.println(a + " & " + b +" is a equal number");
		}
		
		System.out.println();
		System.out.println("Prg 2--> Find Largest of Three Numbers");
		int c=10, d=50, e=100;
		if(c>d && c>e)
		{
			System.out.println(c+" is a largest number");
		}
		else if(d>c && d>e)
		{
			System.out.println(d+" is a largest number");
		}
		else
		{
			System.out.println(e+" is a largest number");
		}
		
		System.out.println();
		System.out.println("Prg 3--> Find Smallest of Three Numbers");
		int f=-10, g=50, h=30;
		if(f<g && f<h)
		{
			System.out.println(f+" is a smallest number");
		}
		else if(g<f && g<h)
		{
			System.out.println(g+" is a smallest number");
		}
		else
		{
			System.out.println(h+" is a smallest number");
		}
		System.out.println();
		System.out.println("Prg 18--> Find Largest of Four Numbers");
		int i=410, j=550, k=30, l=500;
		if(i>j && i>k && i>l)
		{
			System.out.println(i+ "- is a Largest Number");
		}
		else if(j>i && j>k && j>l)
		{
			System.out.println(j+ "- is a Largest Number");
		}
		else if(k>i && k>j && k>l)
		{
			System.out.println(k+ "- is a Largest Number");
		}
		else
		{
			System.out.println(l+ "- is a Largest Number");
		}
	}
}
