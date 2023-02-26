//1. Calculate the average of given array. 

import java.util.*;

public class P01{
	public static void main(String[] args){
		int[] arr={2,5,6,8,9};
		int avg=0;
		for(int i:arr){
			avg+=i;
		}
		System.out.print(avg/arr.length);	
	}
}