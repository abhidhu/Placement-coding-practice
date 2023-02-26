//7. How to check the given number is Positive or Negativein Java? 

import java.util.Scanner;


public class D6{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n>0)		System.out.println("No is positive");
		else if(n<0) System.out.println("No is negative");
		else System.out.println("No is zero ");	
	}
}