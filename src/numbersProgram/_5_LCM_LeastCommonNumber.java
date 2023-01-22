package numbersProgram;

public class _5_LCM_LeastCommonNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Prg 4 --> Java Program to Find LCM of Two Numbers  ");
		int x1=8, x2=20;
		int gcd=1, lcm=1;
		
		for(int a=1; a<=x1 && a<=x2; a++)
		{
			if(x1%a==0 && x2%a==0)
			{
				gcd=a;
			}
		}
		lcm=(x1*x2)/gcd;
		System.out.println("LCM of "+x1 +" and "+x2+" is "+lcm);	
	}
}
