class Queick{
	
	static void quick(int[] arr, int start, int end){
		
		if(start>=end)		return;
		
		int low=start;
		int hi=end;
		
		int mid=start+(end-start)/2;
		
		int pivot=arr[mid];
		
		while(low<=hi){
			
			while(arr[low]<pivot)		low++;
			
			while(arr[hi]>pivot)		hi--;
			
			int temp=arr[low];
			arr[low]=arr[hi];
			arr[hi]=temp;
			
			low++; hi--;

		}
		
	}
	
	static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	public static void main(String[] args){
		int[] arr={7,6,5,4,3,2,1};
		quick(arr,0,arr.length-1);
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}