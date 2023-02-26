// 6. Write a Java Program to find the Intersection of Two Sortedarrays. 

import java.util.*;


public class P06{
	public static void main(String[] args){
		 int a[] = {1, 2, 3, 4, 5, 6};
		 int b[] = {3, 4, 5, 6, 7};
		 List<Integer> list=new ArrayList<Integer>();
		 int i=0;
		 int j=0;
		 while(i<a.length && j<b.length){
			if(a[i]==b[j]){
				list.add(a[i]);
				i++;
				j++;
			}else if(a[i]<b[j]){
				i++;
				
			 }else{
				j++;
				
			 }
		 }
		 
		for(int num: list){
			System.out.print(num+" ");
		}
	}
}