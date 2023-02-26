// Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 

import java.util.Scanner;

public class D13{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int ans=Math.min(a,b);
		ans=Math.min(ans,c);
		System.out.println(ans);
	}
}