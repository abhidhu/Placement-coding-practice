// 7. Write a Java Program to find the Union of Two Arrays (UnSorted Array). 

import java.util.*;

public class P07{
	public static void main(String[] args){
		int a[] = {89, 24, 75, 11, 23};
		int b[] = {89, 2, 4};
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++){
			set.add(b[i]);
		}
		
		for(int i: set){
			System.out.print(i+" ");
		}
		
	}
}

