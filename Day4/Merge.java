import java.util.*;

class Merge{
	
	static int[] merge(int[] left, int[] right){
		
		int count=0, l=0, r=0;
		int[] res=new int[left.length+right.length];
		while(l<left.length && r<right.length){
			if(left[l]<right[r]){
				res[count++]=left[l++];
			}else{
				res[count++]=right[r++];
			}
		}
		
		while(l<left.length){
			res[count++]=left[l++];
		}
		
		while(r<right.length){
			res[count++]=right[r];
		}
		
		return res;
	}
	
	static int[] mergeSort(int[] arr){
		
		if(arr.length==1)		return arr;
		int mid=arr.length/2;
		int[] left=Arrays.copyOfRange(arr,0,mid);
		int[] right=Arrays.copyOfRange(arr,mid,arr.length);
		
		return merge(mergeSort(left),mergeSort(right));
		
		
	}
	
	public static void main(String[] args){
		int[] arr={7,6,5,4,3,2,1};
		arr=mergeSort(arr);
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}