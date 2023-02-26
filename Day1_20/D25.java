// Write a Java Program to check whether the given number is Perfect Numberor NOT. 

import java.util.Scanner;

public class D25{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=1;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)	ans+=i+(n/i);
		}
		
		if(ans==n)	System.out.println("No is perfect");
		else System.out.println("No is Not perfect");
		
	}
}