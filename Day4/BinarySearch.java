public class BinarySearch{
	
	//First approch without recursion 
	static int binarySearch(int[] arr, int target){
		
		if(arr.length==0)	return -1;
		int s=0;
		int e=arr.length-1;
		while(s<=e){
			int mid=s+(e-s)/2;
			if(arr[mid]==target)	return mid;
			if(arr[mid]<target){
				s=mid+1;
			}else{
				e=mid-1;
			}
		}
		return -1;
	}
	
	//with recusrion 
	
	static int binarySearchRecursion(int[] arr,int target, int start, int end){
		
		if(start>end)	return -1;
		int mid=start+(end-start)/2;
		if(arr[mid]==target)	return mid;
		if(arr[mid]<target){
			return binarySearchRecursion(arr,target,mid+1,end);
		}else{
			return binarySearchRecursion(arr,target,start,mid-1);
		}
	}
	
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
		System.out.println(binarySearch(arr,88));
		System.out.println(binarySearchRecursion( arr, 88, 0, arr.length-1));
		
	}
}