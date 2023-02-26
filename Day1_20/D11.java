// Write a Java Program to print all the Factors of the Given number.

import java.util.Scanner;

public class D11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0) 	System.out.print(i+" ");
		}
	}
}