// Write a Java Program to check two strings are Anagramto each other or NOT.
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Scanner;
public class P07{
	
	static boolean isAnagram(String str1, String str2){
		if(str1.length()!=str2.length())		return false;
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++){
			if(ch1[i]!=ch2[i])		return false;
		}
		return true;
	}
	
	// second method using hashmap
	static boolean isAnagram2(String str1, String str2){
		if(str1.length()!=str2.length())		return false;
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str1.length();i++){
			Character ch=str1.charAt(i);
			if(map.containsKey(ch)){
				int count=map.get(ch);
				count++;
				map.put(ch,count);
			}else{
				map.put(ch,1);
			}
		}
		
		for(int i=0;i<str2.length();i++){
			Character ch=str2.charAt(i);
			if(map.containsKey(ch)){
				int count=map.get(ch);
				--count;
				map.put(ch,count);
			}else{
				return false;
			}
		}
		
		for(Entry<Character,Integer> entry: map.entrySet()){
			if(entry.getValue()!=0)	return false;
		}
		
		
		/*map.forEach((key, value)->{
			if(value!=0)		return false;
		}); */
		
		
		return true;
		
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		System.out.println(isAnagram(str1,str2));
		System.out.print(isAnagram2(str1,str2));
		
		
	}
}