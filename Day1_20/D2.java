//2. Write a Java Program to find the Factorialof given number.
import java.util.Scanner;


public class D2{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to Find Factorial");
		int n=sc.nextInt();
		System.out.println(fact0(n));
		System.out.println(fact1(n));
		
	}
	static int fact0(int n){
		if(n<=1)		return 1;
		return n* fact0(n-1);
	}
	static int fact1(int n){
		int res=1;
		for(int i=1;i<=n;i++){
			res=res*i;
		}
		return res;
	}
	
}