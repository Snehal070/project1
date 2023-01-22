package arrayProgram;
import java.util.Arrays;
import java.util.Collections;

public class Array_Predefinedclass 
{
	public static int missNum(int a[], int n)
	{
		int sum=0;
		 for(int i=0; i<a.length; i++)
		 {
			 sum=sum+a[i];
		 }
		 
		int sum1=0;
		int c=a[a.length-1];
		 
		 for(int j=a[0]; j<=c; j++) //c=5
		 {
			 sum1=sum1+j; //3
		 }
		 
		int num =sum1-sum;
		 return num;
	}
	

	 public static void main(String[] args) 
	 {
		 int a[]= {22,23,24,25,27,28,29};
	
		int MissNumber=missNum(a, a.length);
		System.out.println(MissNumber);
		 
		 
	}
	 
}
