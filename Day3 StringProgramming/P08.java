//Write a Java program to find the Most Repeated Characterin the Given String.
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;


class P08{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(repeating1(str));	
		System.out.println(reapeating2(str));	
	}
	
	static char reapeating2(String str){
		if(str.length()==1)	return str.charAt(0);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(map.containsKey(ch)){
				int count=map.get(ch);
				count++;
				map.put(ch,count);
			}else{
				map.put(ch,1);
			}
		}
		int max=0;
		char ch=' ';
		for(Entry<Character,Integer> entry: map.entrySet()){
			if(max<entry.getValue()){
				max=entry.getValue();
				ch=entry.getKey();
			}
		}
		return ch;
	}
	
	
	static char repeating1(String str){
		if(str.length()==1)	return str.charAt(0);
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		int count=1;
		int max=0;char ch=arr[0];
		for(int i=1; i<arr.length;i++){
			if(arr[i]==arr[i-1]){
				count++;
				if(max<count){	max=count; ch=arr[i];	}
			}else{
				count=1;
			}
		}
		return ch;	
	}
}