// Write a Java Program to check whether the Given Number is Prime Number or NOT. 

import java.util.Scanner;

public class D21{
	static boolean isPrime(int n){
		
		if(n<2)	return false;
		if(n==2)	return true;
		if(n%2==0)	return false;
		
		for(int i=3;i<=Math.sqrt(n);i++){
			if(n%i==0){
				System.out.println(i);
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
}