// Write a Java Program to Print All Permutationsof a given String.



import java.util.Scanner;

public class P11{
	
	static void permutaion(String str, String ans){
		if(str.length()==0){		System.out.println(ans);	return}
			
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			String sub=str.substring(0,i)+str.substring(i+1,str.length());
			permutaion(sub,ans+ch);
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		permutaion(s1,"");
		
	}
}