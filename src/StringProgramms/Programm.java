package StringProgramms;

public class Programm 
{
	public static void main(String[] args)
	{
		String a="Snehal";
		String b="snehal";
		String c= "Snehal";
		//Compare two string - string.equal() method - Result - Boolean
		System.out.println(a.equals(b)); //False=Snehal and snehal not same string
		System.out.println(a.equals(c)); //True=Snehal and Snehal are same string
		
		
		//Compare address of two string - (==) operator - Result - Boolean
		
		System.out.println(a==b); //Snehal and snehal store at different address
		System.out.println(a==c); //Snehal and Snehal store at different address
		
		//Find numbers of char in string = By string.length() method
		
		System.out.println(a.length());
		
		//Reverse the string char by char
		
		String rev="";
		for(int i=(a.length()-1); i>=0; i--)
		{
			 rev = rev+a.charAt(i);
		}
		System.out.println("Reverse of Snehal is = "+rev);
		System.out.println();
		
		//Reverse the string word by word
		
		String z="My name is Snehal, I am SDET Engg";
		System.out.println("Original String is - "+z);
		System.out.println("Reverse string is - ");
		String x[]=z.split(" ");
		for(int i=x.length-1; i>=0; i--)
		{
			System.out.print(x[i] + " ");
		}
		System.out.println();
		
		//Convert string to Upper Case or Lower Case characters
		
		System.out.println();
		System.out.println("Uppercase = "+a.toUpperCase());
		System.out.println("Lowecase = "+a.toLowerCase());
		
		//Remove space from String = by string.trim() method
		//This method only remove starting and ending space of string
		System.out.println();
		String str=" Snehal ";
		System.out.println("Orignal String:"+str);
		System.out.println("Trim String:"+str.trim());
		
		//Replace space of string with special character
		System.out.println();
		System.out.println("Replace string space with @ ");
		String st=" Hii, How are you ? ";
		System.out.println(st.replace(" ", "@"));
		
		String k="akshay";
		
		System.out.println(k.replace("a",""));
	}	
}
