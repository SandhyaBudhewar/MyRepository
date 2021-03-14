/*  Write down the program using constructor which accept 3 digit number from user, reverse 
    the digits using constructor and by using another constructor print the factorial of last 
    digit after reverse.*/



package Assignment;

import java.util.Scanner;

public class MyConstructor {
	
	public MyConstructor(int a)
	{
		int digit=0, reverse=0;
		
		while(a!=0)
		{
			digit=a%10;
			reverse=reverse*10+digit;
			a=a/10;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  
		System.out.println("Please enter a three digit number: ");
		int a=sc.nextInt();
		
		MyConstructor obj= new MyConstructor(a);

	}

}
