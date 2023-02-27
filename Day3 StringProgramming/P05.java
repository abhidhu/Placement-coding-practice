// Write a java program to Count the Number of Vowelsin the given string.

import java.util.Scanner;


class P05{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			switch(ch){
				case 'A':	count++; break;
				case 'a':	count++; break;
				case 'I':	count++; break;
				case 'i':	count++; break;
				case 'E':	count++; break;
				case 'e':	count++; break;
				case 'O':	count++; break;
				case 'o':	count++; break;
				case 'U':	count++; break;
				case 'u':	count++; break;
			}
		}
		System.out.print(count);
	}
}