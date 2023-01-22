package numbersProgram;

public class MultiplyNumber_withoutMultiply_sign
{
	public static void main(String[] args) 
	{
		System.out.println("Multiply 2 numbers withou * sign");
		
		int b=5, v=30;
		int sum=0;
		for(int f=1; f<=b; f++)
		{
			sum=sum+v;//1-30 //2-60 //3-90 //4-120 //5-150
		}
		System.out.println(sum);
	}
}
