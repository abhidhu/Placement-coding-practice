//1. Check the given number is EVEN or ODD.
import java.util.*;


public class D1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check odd or even");
		
		int n=sc.nextInt();
		if(n%2==0)		System.out.println("Number is even");
		else			System.out.println("Number is odd");
		
		if((n&1)==0)		System.out.println("Number is even");
		else			System.out.println("Number is odd");
		
		
		
	}
}