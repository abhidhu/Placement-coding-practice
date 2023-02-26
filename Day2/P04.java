public class P04{
	
	static int missingNumber(int arr[], int n) {
    
		int mis=(n*(n+1))/2;
		
		for(int i=0;i<n-1;i++){
			mis-=arr[i];
		}
		return mis;
    
    }
	public static void main(String[] args){
		int[] arr={6,1,2,8,3,4,7,10,5};
		System.out.println(missingNumber(arr,10));
	}
}