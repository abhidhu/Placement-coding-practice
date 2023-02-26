// Write a Java Program to check whether the given number is Armstrong Numberor NOT. 

import java.util.Scanner;

public class D23{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		 int temp=n;
        int ans=0;
        while(temp>0){
            int c=temp%10;
            ans=ans+c*c*c;
            temp/=10;
        }
        
        if(ans==n)      System.out.println( "Yes");
        else  System.out.println( "No");
		
		
		
		//Array uniun
		/*
		int[] arr1={2,3,5};
		int[] arr2={2,2,3,7};
		int[] ans=new int [5];
		int i=0;int j=0;int count=0;
		while(i<3 || j<4){
			if(i<3 && j<4){
				if(arr1[i]==arr2[j]){
					ans[count++]=arr1[i];
					i++;j++;
				}else if(arr1[i]<arr2[j]){
					ans[count++]=arr1[i++];
				}else if(arr1[i]>arr2[j]){
					ans[count++]=arr2[j++];
				}
			}else{
				while(i<3){
					ans[count++]=arr1[i++];
				}
				while(j<4){
					ans[count++]=arr2[j++];
				}
				
			}
			
		}
		for(int num:ans)	System.out.print(num+" ");
		
		*/
		
	}
}