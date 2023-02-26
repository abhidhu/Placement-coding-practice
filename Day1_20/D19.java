//  Check whether the Given Numberis a Palindrome or NOT. 

import java.util.Scanner;

public class D19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int ans=0;
		while(temp>0){
			ans+=temp%10;
			temp/=10;
			ans*=10;
		}
		ans/=10;
		if(ans==n) System.out.println("Number is Palindrome");
		else	System.out.println("Number is Not Palindrome");
	}
}