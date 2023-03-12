class Binary{
	
	static int binaryR(int[] arr, int k, int start, int end){
		
		if(start>end)		return -1;
		
		int mid=start+(end-start)/2;
		
		if(arr[mid]==k)		return mid;
		
		if(arr[mid]<k){
			return binaryR(arr,k,mid+1 ,end);
		}else{
			return binaryR(arr,k,start,mid-1);
		}
	}
	
	static int cealing(int[] arr, int k){
		if(arr.length==0)	return 0;
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end){
			int mid=start+(end-start)/2;
			
			if(arr[mid]==k)	return mid;
			
			if(arr[mid]<k){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		if(start<arr.length)
		return start;
	
		return -1;
	}
	
	
	static int binary(int[] arr, int k){
		if(arr.length==0)	return -1;
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end){
			int mid=start+(end-start)/2;
			
			if(arr[mid]==k)	return mid;
			
			if(arr[mid]<k){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9,10,15,19,35};
		
		System.out.println(binary(arr,10));
		
		System.out.println(binaryR(arr,10,0,arr.length-1));
		
		System.out.println(cealing(arr,37));
		
	}
}