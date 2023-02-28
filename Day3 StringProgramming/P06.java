//Check Given String is Rotation of Another String.
import java.util.Scanner;

public class P06{
	
	//Method 1 with n*n worst case time complexity
	static int isRotated(String str1, String str2){
		if(str1.length()!=str2.length())		return -1;
		
		int n=str1.length();
		for(int i=0;i<n;i++){
			String temp=str1.substring(i,n)+str1.substring(0,i);
			if(temp.equals(str2)) 	return i;
		}
		return -1;
	}
	
	//Method with concating string
	
	static int rotated(String str1, String str2){
		if(str1.length()!=str2.length())		return -1;
		
		String str=str1+str1;
		
		for(int i=0;i<str1.length();i++){
			if(str.charAt(i)==str2.charAt(0)){
				String temp=str.substring(i,i+str2.length());
				if(temp.equals(str2))	return i;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.print(isRotated(str1,str2));
		System.out.print(rotated(str1,str2));
		
	}
}