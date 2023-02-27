//Swap two string without using third

import java.util.Scanner;

public class P02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i=s1.length();
		s1=s1+s2;
		s2=s1.substring(0,i);
		s1=s1.substring(4,s1.length());
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
/*
s1=Abhi 
s2=Dhu
int i=s1.length()
s1=AbhiDhu
s2=s1.substring(4,s1.length());
s1=s1.substring(0,i);
*/