//How do you count the Number of Wordsin a given String using Split method?

import java.util.Scanner;

public class P09{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		String[] arr=s1.split(" ");
		
		System.out.print(arr.length);
		
	}
}