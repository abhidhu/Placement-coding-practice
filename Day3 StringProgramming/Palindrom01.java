// Check wheter the given String is palindrome or not

import java.util.Scanner;

public class Palindrom01{
	
	static boolean isPalindrom(String str){
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(isPalindrom(str)){
			System.out.print("Given string is palindrome");
		}else{
			System.out.print("Given string is not palindrome");
		}
	}
}