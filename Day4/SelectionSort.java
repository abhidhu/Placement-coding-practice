class SelectionSort{
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
/*		
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j])	min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i: arr){
			System.out.print(i+" ");
		}
		
		*/
		
		
		
		
		for(int i=0;i<arr.length;i++){
			
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}