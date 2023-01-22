package numbersProgram;


public class A_17_ArmstrongNumber 
{
	public static void main(String[] args)
	{
		int num=153;
		int temp=num;
		
		int rem=0;
		int rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev +(rem*rem*rem);
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(rev + " is a Armstrong Number");
		}
		else
		{
			System.out.println(rev + " is Not Armstrong Number");
		}
		
		int kk=153;
		int sum=0;
		for(int i=kk; i>0; i=i/10)
		{
			int remm=i%10;
			sum=sum+(remm*remm*remm);
		}
		if(sum==kk)
		{
			System.out.println(kk+" is a Armstrong Number");
		}
		else
		{
			System.out.println(kk+" is not Armstrong Number");
		}
	}
}
