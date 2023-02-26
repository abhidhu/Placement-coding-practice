// Write a java program to LCM of TWO given numberusing Prime Factors method. 

import java.util.*;

public class D18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=2;n1>1 || n2>1;i++){
			
			while(n1%i==0 || n2%i==0){
				
				if(n1%i==0)	n1/=i;
				if(n2%i==0)	n2/=i;
				list.add(i);
			}
		}
		int ans=1;
		for(int i: list){
			ans*=i;
		}
		
		System.out.println(ans);
	}
}