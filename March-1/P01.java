//3. Write a Java program to find the median of the number inside the window (size k) at each 
//moving in a given array of integers with duplicate numbers. Move the window from the start 
//of the array. [1 Mark

public class P01{
	static int[] median(int[] arr, int k){
		int n=arr.length-k+1;
		int[] ans=new int[n];
		int count=0;
		for(int i=0;i<arr.length&&i+k<=arr.length;i++){
			int sum=0;
			
			for(int j=0;j<k;j++){
				sum+=arr[i+j];
			}
			System.out.println(i+" "+sum);
			float temp=sum/k;
			sum=(int)Math.round(temp);
			
			ans[count++]=sum;
		}
		return ans;
		
		
	}
	
	static int[] median2(int[] arr, int k){
		
		int n=arr.length-k+1;
		int[] ans=new int[n];
		
		int median=0;
		for(int i=0;i<k;i++){
			median=arr[i];
		}
		median=Math.round(median/k);
		int count=0;
		ans[count++]=median;
		for(int i=k;i<arr.length;i++){
			median=k*median-arr[i-k];
			median+=arr[i];
			ans[count++]=Math.round(median/k);
		}
		
		return ans;
		
		
	}
	
	static int[] median3(int[] arr, int k){
		int n=arr.length-k+1;
		int[] ans=new int[n];
		
		int count=k/2;
		int c=0;
		for(int i=count;i<arr.length-count;i++){
			
			ans[c++]=arr[i];
			
			
		}
		
		return ans;
		
	}
	
	static int med(int[] arr, int start, int end){
		int mid=Math.round(start+(end-start)/2);
		
		return arr[mid];
		
	}
	
	
	
	static int[] ans(int[] arr, int k){
		int n=arr.length-k+1;
		int[] ans=new int[n];
		int c=0;
		for(int i=0;i<=arr.length-k;i++){
			ans[c++]=med(arr,i,i+k);			
		}
		return ans;
		
	}
	
	public static void main(String[] args){
		int[] arr={10,20,30,40,50,70,80,90};
		
		int[] ans=ans(arr,2);
		
		for(int i: ans){
			System.out.print(i+" ");
		}
		System.out.println();
		int[] ans1=ans(arr,3);
		
		for(int i: ans1){
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		int[] ans2=ans(arr,4);
		
		for(int i: ans2){
			System.out.print(i+" ");
		}
		
		
		
		/*System.out.println(Math.round(6.7));
		int[] ans=median(arr,3);
		int[] ans1=median2(arr,3);
		int[] ans2=median3(arr,3);
		int[] ans3=median3(arr,4);
		for(int i:ans){
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println();
		for(int i:ans){
			System.out.print(i+ " ");
		}
		
		
		System.out.println();
		System.out.println();
		for(int i:ans2){
			System.out.print(i+ " ");
		}
		
		
		System.out.println();
		System.out.println();
		for(int i:ans3){
			System.out.print(i+ " ");
		} */
		
		
		
	}
}