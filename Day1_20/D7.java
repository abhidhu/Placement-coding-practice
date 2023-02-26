// 8. Write a Java Program to find whether given number is Leap year or NOT?

import java.util.Scanner;


public class D7{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%100==0 && n%400==0)		System.out.println("Year is leap year");
		else if(n%100!=0 && n%4==0) System.out.println("Year is leap year");
		else System.out.println("Year is not leap year ");	
	}
}