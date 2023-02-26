// Write a Java Program to Move all Zeros to Start of the Array. 

public class P11{
	public static void main(String[] args){
		int[] arr={1,4,2,6,0,7,0,4,6,0,1,23,0,87,-12,06,0};
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0)	count++;
		}
		int[] ans=new int[arr.length];
		int j=0;
		//count-=1;
		for(int i: arr){
			System.out.print(i+" ");
			if(i==0){
				ans[j++]=0;
			}else{
				ans[count++]=i;
			}
		}
		System.out.println();
		for(int i:ans){
			System.out.print(i+" ");
		}
	}
}
