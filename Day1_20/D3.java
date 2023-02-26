//3. Find the Factorialof a number using Recursion. 

import java.util.Scanner;


public class D3{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to Find Factorial");
		int n=sc.nextInt();
		System.out.println(fact(n));		
	}
	static int fact(int n){
		if(n<=1)		return 1;
		return n* fact0(n-1);
	}
	
}