package arrayProgram;

import java.util.Set;
import java.util.TreeSet;

public class ArrayProgram_1_7 
{
	public static void main(String[] args) 
	{
		//Prg 1 - Print the elements  of an array
		/* int a[]= {20,45,75,89,78,90,43,53};
		
		System.out.println("Length of array a is - " +a.length);
		System.out.println("Elements Of Array is - ");
		for(int i=0; i<=(a.length-1); i++)
		{
			System.out.println(a[i]);
		}*/
		
		//Prg 2 - Print the elements of an array in reverse order
		
		/*int a[]= {20,45,75,89,78,90,43,53};
		System.out.println("Elements Of Array in Reverse order is - ");
		for(int i=(a.length-1); i>=0; i--)
		{
			System.out.println(a[i]);
		}*/
		
		//Prg 3 - Print even number in array
		
		/*int a[]= {20,45,75,89,78,90,43,53};
		System.out.println("Even Numbers in array is - ");
		for(int i=0; i<=(a.length-1); i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}*/
		
		//Prg 4 - Print odd number in array
		/* int a[]= {20,45,75,89,78,90,43,53};
		System.out.println("Odd Numbers in array is - ");
		   for(int i=0; i<=(a.length-1); i++)
			{
			   if(a[i]%2!=0)
				{
				 System.out.println(a[i]);
				}
			}*/
		
		//Prg 5 - find largest number in array
		
		/* int a[]= {20,45,75,89,78,90,43,53};
		int large=a[0]; 
		for(int i=0; i<=(a.length-1); i++)
		{
			if (a[i]>large) 
			{
				large=a[i]; 
			}
		}*/
		//System.out.println("Largest Number in array is - " + large);
		
		//Prg-6 find smallest number in array
		
		/* int a[]= {20,45,75,89,78,90,43,53};
		int small=a[0];
		for(int i=0; i<=(a.length-1); i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println("Smallest number in array is - "+small);*/
		
		//prg-7 Print alternate numbers in array
		
	/*	int a[]= {20,45,75,89,78,90,43,53};
		System.out.println("Alternate No in Array is - ");
		for(int i=0; i<=(a.length-1); i=i+2)
		{
			System.out.println(a[i]);
		}*/
		
		int a[]= {20,45,75,89,78,90,43,53};
		Set<Integer> x =new TreeSet<Integer> ();
		for(int i=0; i<a.length; i++)
		{
			x.add(a[i]);
		}
		System.out.println(x);
		
	}
}
