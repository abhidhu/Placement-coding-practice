//10. Write a Java Program to print the digits of a Given Number.

import java.util.Scanner;


public class D8
{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int length=(int)Math.log10(n)+1;
		int arr[]=new int[length];
		for(int i=length-1;i>=0;i--){
			arr[i]=n%10;
			n/=10;
		}
		for(int i: arr)		System.out.print(i+" ");
	}
}