//4. Swap two numberswithout using third variable approach 1. 

import java.util.Scanner;


public class D4{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a two number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println(n1+" "+n2);
	}
	
}