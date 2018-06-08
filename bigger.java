package assignment23;

import java.util.Scanner;

public class bigger {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && b>c)
		
			System.out.print("Greatest among "+a+","+b+","+c+"="+a  );
		
		
		else if(b>a && a>c)
		
			System.out.print("Greatest among "+a+","+b+","+c+"="+b  );	
		
		
		else
			System.out.print("Greatest among "+a+","+b+","+c+"="+c  );

	}

}
