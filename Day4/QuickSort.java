class QueckSort{
	
	static void quick(int[] arr, int low, int hi){
		
		if(low>=hi)		return;
		
		int mid=low+(hi-low)/2;
		int pivot=arr[mid];
		int s=low;
		int e=hi;
		
		while(s<=e){
			
			while(arr[s]<pivot)			s++;
			
			while(arr[e]>pivot)			e--;
			
			if(s<=e){
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				e--;
				s++;
			}
		}
		
		quick(arr,low,e);
		quick(arr,s,hi);
		
	}
	
	
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
		quick(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}