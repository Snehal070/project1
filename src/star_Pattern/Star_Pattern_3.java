package star_Pattern;

public class Star_Pattern_3 
{
	public static void main(String[] args)
	{
		int c=0; int d=2;
		for(int a=1; a<=50; a++)
		{
			for(int b=1; b<=a; b++)
			{
				if(a%b==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				if(d%2==0)
				{
					System.out.println(a);
				}
				d=d+1;
			}
			c=0;
		}
    }
}
