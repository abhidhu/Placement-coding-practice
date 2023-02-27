//Write a java program to Reverse a Stringwithout using in-build function.
import java.util.Scanner;
public class P03{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans="";
		for(int i=str.length()-1;i>=0;i--){
			ans=ans+str.charAt(i);
		}
		str=ans;
		System.out.println(str);	
	}
}