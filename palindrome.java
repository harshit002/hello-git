package assignment23;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int n=a;int d;int s=0;
		while(n>0)
		{
			d=n%10;
			s=s*10+d;
			n=n/10;
			
		}
		if(s==a)
			System.out.print("the no. is palindrome");
		else
			System.out.print("the no. is not palindrome");
			
		
	}

}
