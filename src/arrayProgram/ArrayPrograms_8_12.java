package arrayProgram;

public class ArrayPrograms_8_12 
{
	public static void main(String[] args)
	{
		//Prg 8 - Copy all elements of one array to another array
		/*int a[]= {20,45,75,89,78,90,43,53};
		//System.out.println(a.length);
		int b[]=new int[7];
		for(int i=0; i<=(b.length-1); i++)
		{
			System.out.println(b[i]=a[i]);
		}*/
		
		///Prg 9 = Sort array elements in ascending order
		int a[]= {20,45,75,89,108,90,43,53};
		int temp=0;
		for(int i=0; i<=(a.length-1); i++) 
		{
			for(int j=i+1; j<=(a.length-1); j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i]; 
					a[i]=a[j]; 
					a[j]=temp;
				}
			}
		
		System.out.println(a[i]);
	}
		//Prg 10 = Sort array elements in descending order
	/*	int a[]= {20,45,75,89,108,90,43,53};
		int temp;
		for(int i=0; i<(a.length-1); i++)
		{
			for(int j=i; j<=(a.length-1); j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
			System.out.println(a[i]);
		}*/
		
		//Prg 11 = find second largest element in array
		 //int a[]= {20,45,75,89,108,90,43,53};
		//int temp;
		for(int i=0; i<=(a.length-1); i++)
		{
			for(int j=i; j<=(a.length-1); j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
		
	}
}
