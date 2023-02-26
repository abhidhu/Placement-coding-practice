// 5. Write a Java Program to find the Intersection of two arrays.

import java.util.*;


public class P05{
	public static void main(String[] args){
		 int a[] = {89, 24, 75, 11, 23};
		 int b[] = {89, 2, 4};
		
		// int a[] = {1, 2, 3, 4, 5, 6};
		// int b[] = {3, 4, 5, 6, 7};
		List<Integer> list=new ArrayList<Integer>();
		
		HashSet<Integer> set=new HashSet<Integer>();
		int count=0;
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++){
			if(set.contains(b[i])){
				count++;
				list.add(b[i]);
				set.remove(b[i]);
			}
		}
		
		System.out.println("No of common element"+count);
		for(int i: list){
			System.out.print(i+" ");
		}
	}
}