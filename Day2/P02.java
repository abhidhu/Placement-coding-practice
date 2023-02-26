// 2. Find the second largest number in the given array. 

import java.util.*;

public class P02{
	public static void main(String[] args){
		int[] arr={2,5,6,8,9,36,22,91,81};
		int avg=0;
		int first=Integer.MIN_VALUE;
		int secound=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(first<arr[i]){
				secound=first;
				first=arr[i];
			}else if(secound<arr[i] && first!=arr[i]){
				secound=arr[i];
			}
		}
		if(secound==Integer.MIN_VALUE){
			System.out.println("There is no secound largest element");
		}else{
			System.out.println("Secound largest element is: "+secound);
		}
	}
}