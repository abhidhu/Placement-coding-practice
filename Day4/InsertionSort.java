public class InsertionSort{
	public static void main(String[] args){
		int[] arr={44,11,22,10,33,66,77,32,88};
		/*
		for(int i=1;i<arr.length;i++){
			int curr=arr[i];
			int j=i-1;
			while(j>=0&& curr<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
		}
		
		for(int i:arr)	System.out.print(i+" ");
		
		*/
		
		for(int i=1;i<arr.length;i++){
			int curr=arr[i];
			int j=i-1;
			while(j>=0 && curr<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}