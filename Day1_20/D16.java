//16. Write a Java Program to find GCD of two given numbers. 

import java.util.Scanner;

public class D16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=Math.max(a,b);i>0;i--){
			if(a%i==0 && b%i==0){
				System.out.println(i);
				break;
			}
		}
		
	}
}