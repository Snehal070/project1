package star_Pattern;

public class NewLogicAll 
{
	public static void main(String [] args)
	{
		System.out.println("Star pattern 1 : ");
		System.out.println();
		int star=5;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		star++;
		System.out.println();
		
		System.out.println("Star pattern 2 : ");
		System.out.println();
		
		int star2=1;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=star2; a++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star2++;
		}
		
		System.out.println();
		System.out.println("Star pattern 3 : ");
		System.out.println();
		
		int star3=5;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=star3; a++)
			{
				System.out.print("*");
			}
			star3--;
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 4 : ");
		System.out.println();
		
		int star4=1;
		for(int i=1; i<=9;i++)
		{
			for(int a=1; a<=star4; a++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star4++;
			}
			else
			{
				star4--;
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 5 : ");
		System.out.println();
		
		int star5=1;
		int space5=4;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=space5; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star5; b++)
			{
				System.out.print("*");
			}
			space5--;
			star5++;
			System.out.println();
		}
	

		System.out.println();
		System.out.println("Star pattern 6 : ");
		System.out.println();
		
		int star6=5;
		int space6=1;
		
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<space6; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star6;b++)
			{
				System.out.print("*");
			}
			star6--;
			space6++;
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 7 : ");
		System.out.println();
		
		int star7=1;
		int space7=4;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=space7; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star7; b++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				space7--;
				star7++;
			}
			else
			{
				space7++;
				star7--;
			}
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 8 : ");
		System.out.println();
		
		int star8=1;
		int space8=5;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=space8; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star8; b++)
			{
				System.out.print(" *");
			}
			space8--;
			star8++;
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 9 : ");
		System.out.println();
		
		int star9=5;
		int space9=1;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=space9; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star9; b++)
			{
				System.out.print(" *");
			}
			star9--;
			space9++;
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 10 : ");
		System.out.println();
		
		int star10=1;
		int space10=4;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=space10; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star10; b++)
			{
				System.out.print(" *");
			}
			if(i<=4)
			{
				space10--;
				star10++;
			}
			else
			{
				space10++;
				star10--;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Star pattern 11 : ");
		System.out.println();
		
		int star11=5;
		int space11=1;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=space11; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star11; b++)
			{
				System.out.print(" *");
			}
			if(i<=4)
			{
				space11++;
				star11--;
			}
			else
			{
				star11++;
				space11--;
			}
			System.out.println();
		}
			

		System.out.println();
		System.out.println("Star pattern 12 : ");
		System.out.println();
		
		int star12=1;
		int space12=4;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=space12; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star12; b++)
			{
				System.out.print("*");
			}
			space12--;
			star12=star12+2;
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Star pattern 13 : ");
		System.out.println();
		
		int star13=9;
		int space13=1;
		for(int i=1; i<=5; i++)
		{
			for(int a=1; a<=space13; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star13; b++)
			{
				System.out.print("*");
			}
			space13++;
			star13=star13-2;
			System.out.println();
		}
		

		System.out.println();
		System.out.println("Star pattern 14 : ");
		System.out.println();
		
		int star14=1; 
		int space14=4;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=space14; a++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star14; b++)
			{
				System.out.print("*");
			}
			if(i<=4)
			{
				star14=star14+2;
				space14--;
			}
			else
			{
				star14=star14-2;
				space14++;
			}
			System.out.println();
		}

			System.out.println();
			System.out.println("Star pattern 15 : ");
			System.out.println();
			
			int space15=0;
			for(int i=1; i<=5; i++)
			{
				for(int a=1; a<=space15; a++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
				space15++;
			}
			

			System.out.println();
			System.out.println("Star pattern 16 : ");
			System.out.println();
			
			int space16=4;
			for(int i=1; i<=5; i++)
			{
				for(int a=1; a<=space16; a++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
				space16--;
			}
			
			System.out.println();
			System.out.println("Star pattern 17 : ");
			System.out.println();
			
			int space17=1;
			for(int i=1; i<=9; i++)
			{
				for(int a=1; a<=space17; a++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
				if(i<=4)
				{
					space17++;
				}
				else
				{
					space17--;
				}
			}
		}

}
