package assignment23;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		
	for(int i=2;i<=(n/2);i++)
	{
		if(n%i==0)
		{
			f=1;
			break;
		}
	}
	
	if(f==1)
		System.out.println("the no. "+n +" is not a prime no.");
	else
		System.out.println("the no. "+n +" is a prime no.");
		
	
		
	}

}
