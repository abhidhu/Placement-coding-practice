//20. Write a Java Program to print all the Prime Factorsof the Given Number. 

import java.util.Scanner;
import java.util.ArrayList;

public class D20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		
		for(int i=2;n>1;i++){
			
			while(n%i==0){
				arr.add(i);
				n=n/i;
			}		
		}
		
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}