//Write a java program to Count the Number of Wordsin a given String.
import java.util.Scanner;
public class P04{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=(str.length()>0):;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)==' ')	++count;
		}
		System.out.println(count);	
	}
}