import java.util.*;

public class MergeSort{
	/*
	static int[] mergeSort(int arr[]){
		if(arr.length==1)	return arr;
		int n=arr.length/2;
		int[] left=Arrays.copyOfRange(arr,0,n);
		int[] right=Arrays.copyOfRange(arr,n,arr.length);
		
		return merge(mergeSort(left),mergeSort(right));
		//44,11,22,10,33,66,77,32,88
	}
	static int[] merge(int[] left,int[] right){
		int[] arr=new int[left.length+right.length];
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length){
			if(left[i]>right[j]){
				arr[k++]=right[j++];
			}else{
				arr[k++]=left[i++];
			}
		}
		while(i<left.length){
			arr[k++]=left[i++];
		}
		while(j<right.length){
			arr[k++]=right[j++];
		}
		return arr;
	}
	*/
	
	static int[] mergeSort(int[] arr){
		if(arr.length==1)	return arr;
		
		int mid=arr.length/2;
		int[] left=Arrays.copyOfRange(arr,0,mid);
		int[] right=Arrays.copyOfRange(arr,mid,arr.length);
		return merge(mergeSort(left),mergeSort(right));
	}
	static int[] merge(int[] left, int[] right){
		int i=0,j=0,k=0;
		int[] ans=new int[left.length+right.length];
		while(i<left.length && j<right.length){
			if(left[i]>right[j]){
				ans[k++]=right[j++];
			}else{
				ans[k++]=left[i++];
			}
		}
		while(i<left.length){
			ans[k++]=left[i++];
		}
		while(j<right.length){
			ans[k++]=right[j++];
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
		
		arr=mergeSort(arr);
		for(int i:arr)	System.out.print(i+" ");
	}
}