class Selection{
	
	static void selection(int[] arr){
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1; j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args){
		int[] arr={7,6,5,4,3,2,1};
		selection(arr);
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}