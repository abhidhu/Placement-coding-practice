class Bubble{
	static void swap(int[] arr,int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void bubble(int[] arr){
		if(arr.length==0)		return;
		
		for(int i=0;i<arr.length;i++){
			boolean flag=false;
			for(int j=1;j<arr.length;j++){
				if(arr[j-1]>arr[j]){
					swap(arr,j,j-1);
					flag=true;
				}
			}
			if(!flag)	break;
		}
	}
	
	public static void main(String[] args){
		int[] arr={7,6,5,4,3,2,1};
		bubble(arr);
		
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
}