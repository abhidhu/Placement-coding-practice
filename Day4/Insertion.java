class Insertion{
	
	static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void insertion(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(arr[j-1]>arr[j]){
					swap(arr,j-1,j);
				}else{
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args){
		int[] arr={7,6,5,4,3,2,1};
		insertion(arr);
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}