//15. Write a java program to Reverse a given number.

import java.util.Scanner;

public class D15{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		
		while(n>0){
			ans+=n%10;
			ans*=10;
			n/=10;
		}
		ans/=10;
		
		System.out.println(ans);
		
	}
}