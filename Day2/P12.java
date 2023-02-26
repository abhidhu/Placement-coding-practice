//  Write a Java Program to Reverse the given array without using additional Array.

public class P12{
	public static void main(String[] args){
		int arr[] = {89, 24, 75, 11, 23};
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}